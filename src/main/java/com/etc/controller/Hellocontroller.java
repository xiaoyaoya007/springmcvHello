package com.etc.controller;

import com.etc.vo.Counter;
import com.etc.vo.From;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class Hellocontroller {


    @RequestMapping("/hello.do")
    public String sayHello(){
        System.out.println("hello.springmvc");
        return null;
    }
//    @RequestMapping("/form.do")
//    public String form(String username,int age,String password,String[] aihao,String home){
//        System.out.println("username:"+username+"age:"+age+"password:"+password+"home:"+home);
//        for (String s:aihao
//             ) {
//            System.out.println(s);
//        }
//        return null;
//    }
        @RequestMapping("/form.do")
    public String form(From from){
        System.out.println(from);
        return "reg";
    }

    @RequestMapping("/counter.do")
    public String form(Counter counter) {
       // System.out.println(counter.getSign());
        int result=0;
        int num1=Integer.valueOf(counter.getNumber1());
        int num2=Integer.valueOf(counter.getNumber2());
        switch (Integer.valueOf(counter.getSign())){
            case 1:
                result=num1+num2;
                break;
            case 2:
                result=num1-num2;
                break;
            case 3:
                result=num1*num2;
                break;
            case 4:
                result=num1/num2;
                break;
        }
        //{"result":"result"}
        String str = "{\"result\":\""+result+"\"}";
        return  "{\"result\":"+result+"}";
       //return {
        //    result:result
        // };
    }

    //将前台传来的username转成name,(required = true)代表字段必填
    @RequestMapping(value = "/reg.do",method = RequestMethod.POST)
    public String reg(@RequestParam(name="password",required = true) String pass,@RequestParam(name="username",required = true) String name, HttpServletRequest request, HttpServletResponse response){
        System.out.println(name+pass);
        HttpSession session = request.getSession();
        Cookie[] cookies = request.getCookies();

        return "reg";
    }

}
