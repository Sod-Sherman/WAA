package com.students.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.students.domain.Student;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentController {

    @ModelAttribute("genders")
    private Map<String, String> populateGender() {
        Map<String, String> genderMap = new HashMap<>();
        genderMap.put("male", "Male");
        genderMap.put("female", "Female");
        return genderMap;
    }


    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String showForm(@ModelAttribute("student") Student student, Model model) {

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult result, Model model,
                              RedirectAttributes redirectAttributes) {

        if (result.hasErrors()) {
            return "registration";
        }

        //save the student here....
        redirectAttributes.addFlashAttribute(student);
        return "redirect:success";

    }

    @RequestMapping(value = "/success")
    public String success() {
        return "success";
    }

}

	

