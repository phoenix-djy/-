package com.baizhi.action;

import com.baizhi.entity.department;
import com.baizhi.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/Department")
public class DepartmentAction {

    @Autowired
    private DepartmentService departmentService;


    @RequestMapping("/showD")
    public void showDepartment(HttpServletResponse response) throws Exception{

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter writer = response.getWriter();
        writer.print("<select>");
        List<department> departments = departmentService.showDepartment();
        for (department department : departments) {
            writer.print("<option value="+department.getId()+">"+department.getDeptname()+"</option>");

        }
        writer.print("/select");
        writer.close();


    }


}
