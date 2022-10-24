package vn.thanhhai.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.thanhhai.dto.UserDto;
import vn.thanhhai.model.User;
import vn.thanhhai.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;


    @GetMapping("create")
    public String add(Model model) {
        model.addAttribute("userDto",new UserDto());
        return "create";
    }


    @PostMapping("save")
    public String create(@Validated @ModelAttribute UserDto userDto,
                         BindingResult bindingResult) {

        new UserDto().validate(userDto, bindingResult);

        if (bindingResult.hasErrors()) {
            return "create";
        } else {
            User user = new User();
            BeanUtils.copyProperties(userDto, user);

            userService.save(user);
            return "create";
        }
    }

}
