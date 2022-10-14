package com.thanhhai.controller;

import com.thanhhai.service.ICalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @Autowired
    ICalcService calcService;

    @GetMapping("/")
    public String list() {
        return "list";
    }

    @PostMapping("/tinh")
    public String cong(@RequestParam int a, int b, String tinh, Model model) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("ketqua", calcService.cong(a, b, tinh));
        return "list";

    }


}
