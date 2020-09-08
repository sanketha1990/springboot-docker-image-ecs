package com.springboot.springbootdockerimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerImageApplication {

	@GetMapping("/")
	public String print() {
		return "Hello: Welcome to Spring Boot Docket with ECS";
	}

	@GetMapping("/{name}")
	public String welcome(@PathVariable("name") String name) {
		return "Hello Mr:" + name;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerImageApplication.class, args);
	}

}
