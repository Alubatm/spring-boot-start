package com.goodrain.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloGoodRainWebController {
	@RequestMapping("/users/{username}")
	public String userProfile(@PathVariable("username") String username, Model model) {

		model.addAttribute("name", username);

		return "hello";
	}
}
