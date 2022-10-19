package vn.thanhhai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.thanhhai.model.Product;
import vn.thanhhai.service.IProductService;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    IProductService productService;

    @GetMapping("")
    public String getProducts(Model model) {
        model.addAttribute("products", productService.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    //    id tự động tăng
//    public int createId() {
//        List<Product> productList = productService.findAll();
//        int maxId = 0;
//        for (Product product : productList) {
//            if (product.getId() > maxId) {
//                maxId = product.getId();
//            }
//        }
//        return maxId + 1;
//    }

    @PostMapping("/save")
    public String save(Product product, RedirectAttributes redirectAttributes) {
        productService.save(product);
        redirectAttributes.addFlashAttribute("success", "Them moi thanh cong");
        return "redirect:/product/";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Product product) {
        productService.update(product.getId(), product);
        return "redirect:/product/";
    }

    @GetMapping("/search")
    public String search(@RequestParam String search, Model model) {
        model.addAttribute("products", productService.findByName(search));
        return "/list";
    }

    @GetMapping("/{id}/delete")
    public String delete(Product product) {
        productService.delete(product);
        return "redirect:/product/";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/view";
    }


}
