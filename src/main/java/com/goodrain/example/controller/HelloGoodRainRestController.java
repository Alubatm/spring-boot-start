package com.goodrain.example.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloGoodRainRestController {

	@RequestMapping("/foo")
	public String descprition() {
		return "Hello bar!";
	}
}
