package com.nhnacademy.minidooray.gateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomePageController {
  @GetMapping
  public String getWelcomePage() {
    return "welcome";
  }

}