package com.thanhhai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @GetMapping("/")
    public String list() {
        return "list";
    }

    @RequestMapping("/save")
    public String save(@RequestParam (required = false) String[] condiment, Model model) {

        model.addAttribute("condiment", condiment);
        return "list";
    }


}
