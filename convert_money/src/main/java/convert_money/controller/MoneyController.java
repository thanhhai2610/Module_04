package convert_money.controller;

import convert_money.service.IServiceMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoneyController {
    @Autowired
    IServiceMoney serviceMoney;

    @GetMapping("/")
    public String showMoney() {
        return "/view";
    }

    @PostMapping
    public String convert_money(@RequestParam double usd, Model model) {
        double vnd = serviceMoney.convert_money(usd);
        model.addAttribute("vnd", vnd);
        model.addAttribute("usd", usd);
        return "/view";
    }
}
