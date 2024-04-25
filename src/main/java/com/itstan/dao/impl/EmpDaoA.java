package com.itstan.dao.impl;

import com.itstan.dao.EmpDao;
import com.itstan.pojo.Emp;
import com.itstan.pojo.Result;
import com.itstan.utils.XmlParserUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //("daoA")
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        // 1. load and analyze emp.xml
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);

        return empList;
    }
}
