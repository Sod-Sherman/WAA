package mum.edu.controller;

import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.model.OurNumber;
import mum.edu.validator.Validator;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@mum.edu.framework.annotation.Controller
public class CalculatorController {

    @AutoWired
    private Validator numValidator;

    @RequestMapping(value = {"/"})
    public String showIndex() {
        return "index.jsp";
    }

    @RequestMapping(value = {"/calculate"})
    public String calculate(OurNumber ourNumber, HttpServletRequest req) {
        List<String> errors = numValidator.validate(ourNumber);
        System.out.println("errors = " + errors);
        if (errors.isEmpty()) {
            System.out.println("ourNumber = " + ourNumber);
            ourNumber.setSum(ourNumber.getNum1() + ourNumber.getNum2());
            ourNumber.setProduct(ourNumber.getNum3() * ourNumber.getNum4());
        }
        req.setAttribute("errors", errors);
        req.setAttribute("ourNumber", ourNumber);
        return "index.jsp";

    }

}
