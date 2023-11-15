package com.example.springboot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{
	@GetMapping("/api/test")
	public String getString() {
		return "tanzu this change ";
	}
	void index(String t){

	}
}
