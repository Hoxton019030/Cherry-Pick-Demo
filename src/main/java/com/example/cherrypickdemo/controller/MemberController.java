package com.example.cherrypickdemo.controller;

import com.example.cherrypickdemo.service.MemberService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hoxton
 * @version 0.1.0
 * @since 0.1.0
 **/
@RestController
@RequiredArgsConstructor
public class MemberController {

    final MemberService memberService;

    @GetMapping("/")
    public String sayHello(){
        return "hello,world";
    }
}
