package com.baizhi.action;

import com.baizhi.entity.Employees;
import com.baizhi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/employee")
public class EmployeeAction {


    @Autowired
    private EmployeeService employeeService;



    @RequestMapping("/showEmployees")
    @ResponseBody
    public Map<String,Object> showEmployees(Integer page, Integer rows) throws Exception{
            //page=当前页号  rows每页显示条数  records 总条数  total 总页数
        Integer records = employeeService.selectRecords();
        Integer total;
        if(records%rows==0){
            total=records/rows;
        }else {
            total=records/rows+1;
        }

        List<Employees> employees = employeeService.showEmployees(page,rows);
        Map<String, Object> maps = new HashMap<String, Object>();
        maps.put("records",records);
        maps.put("page",page);
        maps.put("rows",employees);
        maps.put("total",total);
        return maps;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public void edit(String oper ,Employees employees)throws Exception{
        if(oper.equals("add")){
            employeeService.add(employees);
        }else if(oper.equals("edit")){
            employeeService.update(employees);

        }

    }
}
