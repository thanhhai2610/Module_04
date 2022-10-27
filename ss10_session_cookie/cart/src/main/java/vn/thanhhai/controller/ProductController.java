package vn.thanhhai.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vn.thanhhai.dto.CartDto;
import vn.thanhhai.dto.ProductDto;
import vn.thanhhai.model.Product;
import vn.thanhhai.service.ProductService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/product")
@SessionAttributes("cart")//Khai bao session cos ten la cart
public class ProductController {

    // khởi tgaoj giá trị chi session cart
    @ModelAttribute("cart")
    public CartDto initCart() {
        return new CartDto();
    }

    @Autowired
    ProductService productService;

    @GetMapping("")
    public String getProduct(Model model,
                             @CookieValue(value = "idProduct", defaultValue = "-1") int idProduct) {
        if (idProduct != -1) {
            model.addAttribute("idProduct",
                    productService.findById(idProduct).get());
        }
        List<Product> productList = productService.findAll();
        model.addAttribute("productList", productList);
        return "list";
    }

    @GetMapping("/detail/{id}")
    public ModelAndView showDetail(@PathVariable int id, HttpServletResponse response) {
        //Taoj cookie
        Cookie cookie = new Cookie("idProduct", id + "");
        cookie.setMaxAge(1 * 24 * 60 * 60);
        cookie.setPath("/");
        response.addCookie(cookie);
        return new ModelAndView("detail",
                "product", productService.findById(id).get());

    }

    @GetMapping("/add/{id}")
    public String addProduct(@PathVariable int id,
                             @SessionAttribute("cart") CartDto cart) {
        Optional<Product> productOptional = productService.findById(id);
        if (productOptional.isPresent()) {
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(productOptional.get(), productDto);

            cart.addProduct(productDto);

        }
        return "redirect:/product";
    }


}
