package com.practice.jwtauth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
@CrossOrigin(origins = "*", maxAge = 3600)
public class SampleController {

	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}

	@GetMapping("/user")
	@PreAuthorize("hasRole('USER') or hasRole('CHAITANYA') or hasRole('ADMIN')")
	public String user() {
		return "welcome";
	}

	@GetMapping("/chaitanya")
	@PreAuthorize("hasRole('CHAITANYA')")
	public String chy() {
		return "CHAITANYA";
	}

	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String admin() {
		return "Admin role";
	}

}
