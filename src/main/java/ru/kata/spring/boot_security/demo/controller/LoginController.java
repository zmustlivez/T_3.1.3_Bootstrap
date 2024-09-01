package ru.kata.spring.boot_security.demo.controller;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.boot_security.demo.security.UserDetailsServiceImpl;

@Controller
@RequestMapping("/login")
public class LoginController {


    @GetMapping
    public String getLoginPage() {
        return "login";
    }

}
