package com.pangmaobao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: he.feng
 * @date: 14:57 2017/11/2
 * @desc:
 **/
@Controller
@RequestMapping("/activiti")
public class TestController {



    @RequestMapping("/test")
    public void test(HttpServletRequest request, HttpServletResponse response) {


    }


    public String fun(String name,int age,String password){


        return "fenghe";
    }
}
