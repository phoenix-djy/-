package com.baizhi.dao;

import com.baizhi.entity.Employees;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDAO {

    public List<Employees> selectEmployees(@Param("s") Integer s, @Param("rows") Integer rows);

     public Integer selectRecords();
     public void save(Employees employees);

     public void update(Employees employees);
}
