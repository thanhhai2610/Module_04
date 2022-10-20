package vn.thanhhai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vn.thanhhai.model.Bloger;
import vn.thanhhai.service.IBloggerService;

import java.util.List;

@Controller
@RequestMapping
public class BloggerController {

    @Autowired
    IBloggerService bloggerService;

    @GetMapping("/blogger")
    public String showBlogList(Model model) {
        List<Bloger> blogers = bloggerService.findAll();
        model.addAttribute("blogs", blogers);
        return "list";
    }

    @GetMapping("/create-blog")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("blog", new Bloger());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView createBlog(@ModelAttribute("blog")Bloger bloger) {
        bloggerService.save(bloger);

        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("blog", bloger);
        modelAndView.addObject("message", "Blog created successfully");
        return modelAndView;
    }


    @GetMapping("/edit-blog/{id}")
    public ModelAndView showUpdateForm(@PathVariable int id) {
        Bloger bloger = bloggerService.findById(id);
        if (bloger != null) {
            ModelAndView modelAndView = new ModelAndView("edit");
            modelAndView.addObject("blog", bloger);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-blog")
    public ModelAndView update(@ModelAttribute("blog")Bloger bloger) {
        bloggerService.save(bloger);

        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("blog", bloger);
        modelAndView.addObject("message", "Updated blog successfully");
        return modelAndView;
    }

    @GetMapping("/delete-blog/{id}")
    public ModelAndView showDeleteForm(@PathVariable int id) {
        Bloger bloger = bloggerService.findById(id);

        if (bloger != null) {
            ModelAndView modelAndView = new ModelAndView("delete");
            modelAndView.addObject("blog", bloger);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-blog")
    public String delete(@ModelAttribute("blog")Bloger bloger) {
        bloggerService.remove(bloger);
        return "redirect:blogger";
    }

    @GetMapping("/view-blog/{id}")
    public ModelAndView view(@PathVariable int id) {
        Bloger bloger = bloggerService.findById(id);

        if (bloger != null) {
            ModelAndView modelAndView = new ModelAndView("view");
            modelAndView.addObject("blog", bloger);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }


}
