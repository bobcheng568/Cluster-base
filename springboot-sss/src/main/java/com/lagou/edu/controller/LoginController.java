package com.lagou.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {


    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/auth")
    public String login(String username, String password, HttpServletResponse response, HttpSession session) {
        if ("admin".equals(username) && "admin".equals(password)) {
            session.setAttribute("username", username);
            return "redirect:/resume/queryAll";
        }
        return "error";
    }

}
