package com.udacity.jdnd.course1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleHomeController {

    private boolean firstMessage;

   @GetMapping("/simple-home")
    public String getHomePage() {
        //model.addAttribute("greetings", new String[] { "Hi", "Hello", "Goodbye"});
        return "simple-home";
    }

}
