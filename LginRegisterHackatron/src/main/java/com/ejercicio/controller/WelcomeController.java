package com.ejercicio.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController

public class WelcomeController {

	//Login & Register server first route
	   @GetMapping("/")
	    public String home() {
	        return "Login & Register server";
	    }
	   
	   @PreAuthorize("hasRole('USER')")
	   @GetMapping("/WelcomeUser")
	    public String welcomeUser() {
	        return "Welcome to the user space";
	    }
	   
}
