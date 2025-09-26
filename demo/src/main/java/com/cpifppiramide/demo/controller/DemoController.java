package com.cpifppiramide.demo.controller;


import com.cpifppiramide.demo.Clases.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/index")
    String inicio(){
        return "index";
    }

    @RequestMapping("/usuario/{name}")
    String usuario(Model model, @PathVariable String name){
        model.addAttribute("name", name);
        return "user";
    }

    @RequestMapping("/formulario")
    String formulario(){
        return "formulario";
    }

    @PostMapping("/datos")
    String datos(User user, Model model){
        System.out.println(user);
        model.addAttribute("user", user);
        return "datos";
    }
}
