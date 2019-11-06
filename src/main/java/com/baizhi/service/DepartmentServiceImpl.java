package com.baizhi.service;

import com.baizhi.dao.DepartmentDAO;
import com.baizhi.entity.department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentDAO departmentDAO;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<department> showDepartment() {
        List<department> departments = departmentDAO.selectAllDepartment();
        return departments;
    }
}
