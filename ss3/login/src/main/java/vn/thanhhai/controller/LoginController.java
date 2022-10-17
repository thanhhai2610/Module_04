package vn.thanhhai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.thanhhai.model.Users;
import vn.thanhhai.service.ILoginService;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    ILoginService studentService;

    @GetMapping("/list")
    public String showList(Model model) {
        List<Users> usersList = studentService.findAll();
        model.addAttribute("studentList", usersList);
        return "list";
    }

    @GetMapping("/list2")
    public String ShowList2(ModelMap modelMap) {
        List<Users> usersList = studentService.findAll();
        modelMap.addAttribute("studentList", usersList);
        return "list";
    }

    @GetMapping("/list3")
    public ModelAndView ModelAndView() {
        return new ModelAndView("list", "studentList", studentService.findAll());
    }


}
