package edu.mum.controller;

import edu.mum.service.CalculatorService;
import edu.mum.service.CalculatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import edu.mum.model.Calculator;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/calculate")
    public String displayForm(){
        return "calculator";
    }

    @PostMapping("/calculate")
    public String displayResult(Calculator calculator, Model model){
        model.addAttribute("sum", calculatorService.calculateSum(calculator));
        model.addAttribute("product", calculatorService.calculateProduct(calculator));
        return "calculator";

    }

}
