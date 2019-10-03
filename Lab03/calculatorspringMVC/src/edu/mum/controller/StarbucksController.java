package edu.mum.controller;

import edu.mum.model.starbucks.Category;
import edu.mum.model.starbucks.Coffee;
import edu.mum.model.starbucks.User;
import edu.mum.service.StarbucksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("starbucks")
public class StarbucksController {

    @Autowired
    StarbucksServiceImpl starbucksService;

    @GetMapping("login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("login")
    public String checkAuthentication(User user, Model model) {
        System.out.println("user = " + user);
        if (starbucksService.checkAuthentication(user)) {
            model.addAttribute("categories", starbucksService.getCategories());
            return "display";
        }

        return "login";
    }

    @PostMapping("advice")
    public String advice(@RequestParam(value = "category") String catId, Model model) {
        System.out.println("catName = " + catId);
//        System.out.println("starbucksService.advice(category) = " + starbucksService.advice(category));
        model.addAttribute("coffees", starbucksService.advice(starbucksService.getCategoryBiId(Long.parseLong(catId))));
        model.addAttribute("categories", starbucksService.getCategories());
        return "display";
    }

}
