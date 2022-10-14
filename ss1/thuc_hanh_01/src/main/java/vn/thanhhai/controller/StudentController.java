package vn.thanhhai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.thanhhai.model.Student;
import vn.thanhhai.service.IStudentService;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    IStudentService studentService;

    @GetMapping("/list")
    public String showList(Model model) {
        List<Student> studentList = studentService.findAll();
        model.addAttribute("studentList", studentList);
        return "list";
    }

    @GetMapping("/list2")
    public String ShowList2(ModelMap modelMap) {
        List<Student> studentList = studentService.findAll();
        modelMap.addAttribute("studentList", studentList);
        return "list";
    }

    @GetMapping("/list3")
    public ModelAndView ModelAndView() {
        return new ModelAndView("list", "studentList", studentService.findAll());
    }


}
