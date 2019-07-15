package com.etc.controller;

import com.etc.vo.Counter;
import com.etc.vo.From;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
        return null;
    }

    @RequestMapping("/counter.do")
    @ResponseBody
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
        return  "{\"result\":\""+result+"\"}";
       //return "{\"result\":result}";
    }

}
