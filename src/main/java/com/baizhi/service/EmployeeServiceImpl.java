package com.baizhi.service;

import com.baizhi.dao.EmployeeDAO;
import com.baizhi.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Employees> showEmployees(Integer page, Integer rows) {
        Integer s =(page-1)*rows;
        List<Employees> employees;
        employees = employeeDAO.selectEmployees(s,rows);
        return  employees;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Integer selectRecords() {
       Integer records = employeeDAO.selectRecords();
       return records;
    }

    @Override
    public void add(Employees employees) {
        String s = UUID.randomUUID().toString();
        employees.setId(s);
        employeeDAO.save(employees);
    }

    @Override
    public void update(Employees employees) {
        employeeDAO.update(employees);
    }
}
