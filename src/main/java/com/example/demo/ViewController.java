package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Controller
public class ViewController {

	@RequestMapping("/")
	public String View() {
		return "view";
	}

}
