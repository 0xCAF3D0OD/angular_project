package com.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@RestController
	static final class myController {
		@GetMapping("/universe")
		public String universe() {
			return "hello universe i'm kevin and i test in a docker compose and in vim yet";
		}
		@GetMapping("/world")
		public String world() {
			return "hello world!";
		}
	}
}
