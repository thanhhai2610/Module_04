package vn.thanhhai.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import vn.thanhhai.dto.InformativeArticlesDto;
import vn.thanhhai.model.InformativeArticles;
import vn.thanhhai.service.InformativeArticlesService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/infor")
public class InformativeArticlesController {

    @Autowired
    private InformativeArticlesService informativeArticlesService;


    @GetMapping("")
    public String list(Model model) {
        List<InformativeArticles> informativeArticles = informativeArticlesService.findAll();
        model.addAttribute("list", informativeArticles);
        return "list";
    }


    @GetMapping("/create")
    public String create( Model model) {
        model.addAttribute("informativeArticlesDto",new InformativeArticlesDto());
        return "create";
    }

    @PostMapping("/save")
    public String save(@Validated @ModelAttribute InformativeArticlesDto informativeArticlesDto,
                       BindingResult bindingResult) {
        new InformativeArticlesDto().validate(informativeArticlesDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return "create";
        } else {
            InformativeArticles informativeArticles = new InformativeArticles();
            BeanUtils.copyProperties(informativeArticlesDto, informativeArticles);

            informativeArticlesService.save(informativeArticles);
            return "redirect:/infor";
        }

    }

}
