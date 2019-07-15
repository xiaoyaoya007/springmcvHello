package com.etc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hellocontroller {
    @RequestMapping("/hello.do")
    public String sayHello(){
        System.out.println("hello.springmvc");
        return null;
    }
    @RequestMapping("/form.do")
    public String form(String username,int age,String password,String[] aihao,String home){
        System.out.println("username:"+username+"age:"+age+"password:"+password+"home:"+home);
        for (String s:aihao
             ) {
            System.out.println(s);
        }
        return null;
    }

}
