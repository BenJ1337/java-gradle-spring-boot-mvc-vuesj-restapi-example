package de.hackersolutions.webapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarPage {

    @GetMapping("/cars")
    String hello() {
        return "cars";
    }
}
