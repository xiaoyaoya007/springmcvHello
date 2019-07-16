package com.etc.controller;

import com.etc.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Addcontroller {
    @RequestMapping(value = "add.do",method = RequestMethod.POST)
  //   public String add(int num1, int num2, ModelMap modelMap){
  //      int sum=num1+num2;
  //      System.out.println("sum:"+sum);
  //      modelMap.addAttribute("sum",sum);
  //      return "add";
  //   }

 /*   public ModelAndView add(int num1, int num2){
        int sum=num1+num2;
        System.out.println("sum:"+sum);
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("add");
        modelAndView.addObject("sum",sum);
        return modelAndView;
    }*/

    public String add(RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("user",new User("nmsl"));

        //重定向
        return "redirect:list.do";
    }

    @RequestMapping("/list.do")
    public String list(User user){
        System.out.println(user);
        return null;
    }
}
