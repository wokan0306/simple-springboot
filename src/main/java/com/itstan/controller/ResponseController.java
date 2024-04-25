package com.itstan.controller;

import com.itstan.pojo.Address;
import com.itstan.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {

//    @RequestMapping("/hello")
//    public String hello() {
//        System.out.println("Hello World ~");
//        return "Hello World";
//    }
//
//    @RequestMapping("/getAddr")
//    public Address getAddr() {
//        Address addr = new Address();
//        addr.setProvince("Guangdong");
//        addr.setCity("Shenzhen");
//        return addr;
//    }
//
//    @RequestMapping("/listAddr")
//    public List<Address> listAddr() {
//        List<Address> list = new ArrayList<Address>();
//        Address addr1 = new Address();
//        addr1.setProvince("Guangdong");
//        addr1.setCity("Shenzhen");
//        Address addr2 = new Address();
//        addr2.setProvince("Guangdong");
//        addr2.setCity("Guangzhou");
//        Address addr3 = new Address();
//        addr3.setProvince("Shanghai");
//        addr3.setCity("Shanghai");
//
//        list.add(addr1);
//        list.add(addr2);
//        list.add(addr3);
//
//        System.out.println(list);
//
//        return list;
//    }

    @RequestMapping("/hello")
    public Result hello() {
        System.out.println("Hello World ~");
        return Result.success("Hello World ~");
    }

    @RequestMapping("/getAddr")
    public Result getAddr() {
        Address addr = new Address();
        addr.setProvince("Guangdong");
        addr.setCity("Shenzhen");
        return Result.success(addr);
    }

    @RequestMapping("/listAddr")
    public Result listAddr() {
        List<Address> list = new ArrayList<Address>();
        Address addr1 = new Address();
        addr1.setProvince("Guangdong");
        addr1.setCity("Shenzhen");
        Address addr2 = new Address();
        addr2.setProvince("Guangdong");
        addr2.setCity("Guangzhou");
        Address addr3 = new Address();
        addr3.setProvince("Shanghai");
        addr3.setCity("Shanghai");

        list.add(addr1);
        list.add(addr2);
        list.add(addr3);

        System.out.println(list);

        return Result.success(list);
    }
}
