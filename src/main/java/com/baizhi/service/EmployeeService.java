package com.baizhi.service;



import com.baizhi.entity.Employees;

import java.util.List;

public interface EmployeeService {

    public List<Employees> showEmployees(Integer page, Integer rows);

    public Integer selectRecords();

    void add(Employees employees);

    void update(Employees employees);
}
