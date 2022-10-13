package dictionary.controller;

import dictionary.service.impl.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("/")
    public String showForm() {
        return "list";
    }

    @PostMapping("/tra")
    public String add(@RequestParam String vie, Model   model) {
        model.addAttribute  ("vie", vie);
        model.addAttribute  ("eng", dictionaryService.searchDictionary(vie));
        return "list";

    }

    @PostMapping("/")
    public ModelAndView searchDictionary(@RequestParam String vie) {
        return new ModelAndView("list", "searchDictionary", dictionaryService.searchDictionary(vie));
    }
}
