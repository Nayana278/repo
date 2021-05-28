package com.example.Springboothelloworld.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    /**
     * Swagger home.
     *
     * @return swagger-ui.html
     */
    @RequestMapping("/")
    public String home() {
        return "redirect:swagger-ui.html";
    }
}
