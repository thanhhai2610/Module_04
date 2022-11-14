package vn.thanhhai.controller;

import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.thanhhai.dto.ProductDto;
import vn.thanhhai.model.Producer;
import vn.thanhhai.model.Product;
import vn.thanhhai.service.IProducerService;
import vn.thanhhai.service.IProductService;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    IProductService productService;

    @Autowired
    IProducerService producerService;

    @ModelAttribute("producerList")
    public List<Producer> producerList() {
        return producerService.myFindAll();
    }

    @GetMapping
    public String getProduct(@RequestParam(value = "searchName", required = false, defaultValue = "") String searchName,
                             @RequestParam(value = "searchPrice", required = false, defaultValue = "0") String searchPrice,
                             @PageableDefault(value = 2) Pageable pageable, Model model
    ) {
        Page<Product> productPage = productService.myFindAll(searchName, searchPrice, pageable);
        model.addAttribute("searchName", searchName);
        model.addAttribute("searchPrice", searchPrice);
        model.addAttribute("productPage", productPage);
        return "list";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") int id, Model model ,
                                RedirectAttributes redirectAttributes ) {
        productService.remove(id);
        redirectAttributes.addFlashAttribute("success", "Xoá thành công");
        return "redirect:/product";
    }

    @GetMapping("/create")
    public String createProduct(@ModelAttribute ProductDto productDto, Model model) {
        model.addAttribute("productDto", productDto);
        return "/create";
    }

    @PostMapping("/create")
    public String createProducts(@Validated @ModelAttribute("productDto") ProductDto productDto ,
                                 BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes ) {
        new ProductDto().validate(productDto, bindingResult);

        if (!bindingResult.hasErrors()) {
            Product product = new Product();
            BeanUtils.copyProperties(productDto, product);
            productService.save(product);
            redirectAttributes.addFlashAttribute("success", "Thêm mới thành công");
            return "redirect:/product";
        }else {
            redirectAttributes.addFlashAttribute("success", "Thêm mới thất bại");
            return "create";

        }


    }

    @GetMapping("/edit/{id}")
    public String editProduct( @PathVariable("id") int id, Model model ){
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "edit";
    }
    @PostMapping("/edit")
    public String editProduct(@ModelAttribute("product") Product product , RedirectAttributes redirectAttributes ){
        productService.save(product);
        redirectAttributes.addFlashAttribute("success", "Chỉnh sủa thành công");
        return "redirect:/product";
    }



}
