package vn.thanhhai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import vn.thanhhai.dto.CartDto;

@Controller
@RequestMapping("/cart")
public class CartController {

    @GetMapping
    public ModelAndView showCart(@SessionAttribute(value = "cart", required = false) CartDto cart) {
        return new ModelAndView("listCart", "cart", cart);

    }
}
