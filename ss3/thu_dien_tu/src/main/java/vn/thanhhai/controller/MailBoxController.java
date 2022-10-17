package vn.thanhhai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.thanhhai.model.MailBox;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mail")
public class MailBoxController {

    @GetMapping("/add")
    public String updateMailBox(@ModelAttribute MailBox mailBox, Model model) {

        List<String> languagesList = new ArrayList<>();
        languagesList.add("English");
        languagesList.add("Vietnamese");
        languagesList.add("Japanese");
        languagesList.add("Chinese");

        List<Integer> size = new ArrayList<>();
        size.add(5);
        size.add(10);
        size.add(15);
        size.add(20);
        size.add(25);
        size.add(50);
        size.add(100);

        System.out.println(languagesList);
        model.addAttribute("mailBox", mailBox);
        model.addAttribute("languagesList", languagesList);
        model.addAttribute("size", size);

        return "create";
    }

    @PostMapping("/save")
    public String updateMail(@ModelAttribute("mail") MailBox mailBox, Model model) {
        model.addAttribute("message", "Update mail box is success");
        return "list";
    }

}
