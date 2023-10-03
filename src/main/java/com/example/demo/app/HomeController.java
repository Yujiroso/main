package com.example.demo.app;

import com.example.demo.form.AccountForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value ="/home")
public class HomeController {

    @RequestMapping(value = "/test")
    public String test(@ModelAttribute AccountForm accountForm,Model model) {
        return "home/test";
    }

    @RequestMapping(value = "test2", method = RequestMethod.POST)
    public String test2(@ModelAttribute @Validated AccountForm accountForm, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "home/test";
        }
        return "home/test2";
    }
}
