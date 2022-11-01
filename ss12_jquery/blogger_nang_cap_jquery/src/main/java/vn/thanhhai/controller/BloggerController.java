//package vn.thanhhai.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//import vn.thanhhai.model.Bloger;
//import vn.thanhhai.repository.ICategoryReppo;
//import vn.thanhhai.service.IBloggerService;
//import vn.thanhhai.service.ICategoryService;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/blog")
//public class BloggerController {
//
//    @Autowired
//    IBloggerService bloggerService;
//
//    @Autowired
//    ICategoryService categoryService;
//
//    @GetMapping("")
//    public String showBlogList(@PageableDefault(value = 5) Pageable pageable, Model model) {
//        Page<Bloger> blogers = bloggerService.findAll(pageable);
//        model.addAttribute("categoryList", categoryService.findAll());
//        model.addAttribute("blogs", blogers);
//        return "list";
//    }
//
//    @GetMapping("/create")
//    private String createBlog(Model model) {
//        model.addAttribute("categoryList", categoryService.findAll());
//        model.addAttribute("blog", new Bloger());
//        return "create";
//    }
//
//    @PostMapping("/create")
//    public ModelAndView createBlog(@ModelAttribute("blog") Bloger bloger) {
//        bloggerService.save(bloger);
//        ModelAndView modelAndView = new ModelAndView("create");
//        modelAndView.addObject("blog", bloger);
//        modelAndView.addObject("message", "Blog created successfully");
//        return modelAndView;
//    }
//
//
//    @GetMapping("/edit-blog/{id}")
//    public ModelAndView showUpdateForm(@PathVariable int id) {
//        Bloger bloger = bloggerService.findById(id);
//        if (bloger != null) {
//            ModelAndView modelAndView = new ModelAndView("edit");
//            modelAndView.addObject("blog", bloger);
//            return modelAndView;
//        } else {
//            return new ModelAndView("error.404");
//        }
//    }
//
//    @PostMapping("/edit-blog")
//
//    public ModelAndView update(@ModelAttribute("blog") Bloger bloger) {
//        bloggerService.save(bloger);
//        ModelAndView modelAndView = new ModelAndView("edit");
//        modelAndView.addObject("blog", bloger);
//        modelAndView.addObject("message", "Updated blog successfully");
//        return modelAndView;
//    }
//
//    @GetMapping("/delete-blog/{id}")
//    public ModelAndView showDeleteForm(@PathVariable int id) {
//        Bloger bloger = bloggerService.findById(id);
//
//        if (bloger != null) {
//            ModelAndView modelAndView = new ModelAndView("delete");
//            modelAndView.addObject("blog", bloger);
//            return modelAndView;
//        } else {
//            return new ModelAndView("error.404");
//        }
//    }
//
//    @PostMapping("/delete-blog")
//    public String delete(@ModelAttribute("blog") Bloger bloger) {
//        bloggerService.remove(bloger);
//        return "redirect:blogger";
//    }
//
//    @GetMapping("/view-blog/{id}")
//    public ModelAndView view(@PathVariable int id) {
//        Bloger bloger = bloggerService.findById(id);
//
//        if (bloger != null) {
//            ModelAndView modelAndView = new ModelAndView("view");
//            modelAndView.addObject("blog", bloger);
//            return modelAndView;
//        } else {
//            return new ModelAndView("error.404");
//        }
//    }
//
//
//}
