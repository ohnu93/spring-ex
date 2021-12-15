package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String hello() {
        return "hello.html";
    }

    @GetMapping("/hi")
    public String hi(Model model) {
        model.addAttribute("name", "John");
        model.addAttribute("text", "example");
        return "hi.html";
    }

    @GetMapping("/bye")
    public String bye(@RequestParam(name="name", required = false, defaultValue = "John") String name, Model model) {
        model.addAttribute("name", name);
        return "bye.html";
    }

    @GetMapping("/age/{age}")
    public String age(@PathVariable("age") Integer age, Model model) {
        model.addAttribute("age", age);
        return "age.html";
    }
}
