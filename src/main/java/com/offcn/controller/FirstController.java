package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class FirstController {
    @RequestMapping("/index")
    public String toIndex(Model model) {
        model.addAttribute("message", "hello");
        User user = new User(1, "zhangsan", 12);
        model.addAttribute("user", user);
        Map map = new HashMap<>();
        map.put("id", 2);
        map.put("age", 12);
        model.addAttribute("map", map);
        return "index";
    }

    @GetMapping("/three")
    public String findAll(Model model) {
        User user = new User(1, "zhangsan", 12);
        User user1 = new User(2, "zhangsan", 12);
        User user2 = new User(3, "zhangsan", 12);
        List list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);
        model.addAttribute("list", list);
        return "index1";
    }

    @GetMapping("/four")
    public String indexPage(Model model) {
        model.addAttribute("userName", "youjiuye");
        model.addAttribute("href", "http");
        return "index1";
    }
    @GetMapping("/five")
    public String indexPage1(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");
        return "index1";
    }
    @GetMapping("/seven")
    public String indexPage2(Model model){
        Date date = new Date();
        model.addAttribute("date",date);
        model.addAttribute("price",128.56D);
        String a = "Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n" ;
   model.addAttribute("strText",a);
   return "index";
    }
}
