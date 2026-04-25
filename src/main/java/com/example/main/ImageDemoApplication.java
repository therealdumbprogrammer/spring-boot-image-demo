package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@SpringBootApplication
public class ImageDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageDemoApplication.class, args);
	}

	@RestController
	@RequestMapping("/api/demo")
	class ImageController {

		@GetMapping
		public Map<String, String> check() {
			return Map.of("message", "Hello World!", "status", "OK", "time", Instant.now().toString());
		}
	}

}
