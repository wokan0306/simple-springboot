package com.itstan.service.impl;

import com.itstan.dao.EmpDao;
import com.itstan.dao.impl.EmpDaoA;
import com.itstan.pojo.Emp;
import com.itstan.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
public class EmpServiceA implements EmpService {

    @Autowired
    private EmpDao empDao;
    @Override
    public List<Emp> listEmp() {

        // 1. Data Acquisition

        List<Emp> empList = empDao.listEmp();
        // 2. Handle Data Transformation
        empList.stream().forEach(emp -> {
            String gender = emp.getGender();
            if (gender.equals("1")) {
                emp.setGender("M");
            } else if (gender.equals("2")) {
                emp.setGender("F");
            }
        });

        empList.stream().forEach(emp -> {
            String job = emp.getJob();
            if (job.equals("1")) {
                emp.setJob("Lecturer");
            } else if (job.equals("2")) {
                emp.setJob("Class Teacher");
            } else if (job.equals("3")) {
                emp.setJob("Career Instructor");
            }
        });

        return empList;

    }
}
