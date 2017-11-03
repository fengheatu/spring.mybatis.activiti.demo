package com.pangmaobao.controller;

import com.google.code.kaptcha.servlet.KaptchaServlet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
}
