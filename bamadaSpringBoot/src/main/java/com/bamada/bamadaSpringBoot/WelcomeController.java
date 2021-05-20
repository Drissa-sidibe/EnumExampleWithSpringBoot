package com.bamada.bamadaSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@Autowired
	WelcomeService service;
	@RequestMapping("/welcome")
	public String WelcomeMessage() {
		return "How are you?";
	}
	@RequestMapping("/welcomeMessage")
	public String retrieveWelcomeMessage() {
		return service.retrieveWelcomeMessage();
	}
		
}
