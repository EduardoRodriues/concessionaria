package br.com.carlosrodrigues.web.controller.auth_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class authController {

    @GetMapping("/login")
    public String login() {

        return "admin/auth/login";
    }
}
