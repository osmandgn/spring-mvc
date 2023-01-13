package com.dgn.controller;

import com.dgn.domain.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }




}


