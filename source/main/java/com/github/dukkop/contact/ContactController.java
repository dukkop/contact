package com.github.dukkop.contact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	@GetMapping
	public String index() {
		return "Hello, Spring!";
	}

}
