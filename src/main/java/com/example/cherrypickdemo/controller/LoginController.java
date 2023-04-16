package com.example.cherrypickdemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hoxton
 * @version 0.1.0
 * @since 0.1.0
 **/
@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(){
        return "login succeed";
    }
}
