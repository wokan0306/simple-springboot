package com.itstan.controller;

import com.itstan.pojo.Emp;
import com.itstan.pojo.Result;
import com.itstan.service.EmpService;
import com.itstan.service.impl.EmpServiceA;
import com.itstan.utils.XmlParserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("listEmp")
    public Result list() {
//        // 1. load and analyze emp.xml
//        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
//        System.out.println(file);
//        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
//
//        // 2. Handle Data Transformation
//        empList.stream().forEach(emp -> {
//            String gender = emp.getGender();
//            if (gender.equals("1")) {
//                emp.setGender("M");
//            } else if (gender.equals("2")) {
//                emp.setGender("F");
//            }
//        });
//
//        empList.stream().forEach(emp -> {
//            String job = emp.getJob();
//            if (job.equals("1")) {
//                emp.setJob("Lecturer");
//            } else if (job.equals("2")) {
//                emp.setJob("Class Teacher");
//            } else if (job.equals("3")) {
//                emp.setJob("Career Instructor");
//            }
//        });

        List<Emp> empList = empService.listEmp();

        // 3. Response Data
        return Result.success(empList);
    }
}
