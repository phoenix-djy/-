package com.baizhi.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testDAO {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Test
    public void test1(){

       // List<Employees> employees = employeeDAO.selectEmployees(s, rows);

       // System.out.println(employees);

    }

}
