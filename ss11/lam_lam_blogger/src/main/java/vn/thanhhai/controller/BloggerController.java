package vn.thanhhai.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.thanhhai.service.BloggerService;

@Controller
@RequestMapping
public class BloggerController {

    @Autowired
    private BloggerService bloggerService;

    @RequestMapping("/blogger")
    public String blogger() {
        return "blogger/blogger";}

}
