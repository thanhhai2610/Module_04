package vn.thanhhai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.thanhhai.service.IDegreeService;
import vn.thanhhai.service.IEmployeeService;
import vn.thanhhai.service.IPositionService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IDegreeService degreeService;

    @Autowired
    private IPositionService positionService;

    @RequestMapping("/list")
    public String list() {

    }

}
