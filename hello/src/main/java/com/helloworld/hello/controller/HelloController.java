package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String Hello() {
		return "hello world, lista habilidades e mentalidades da Generation: orientação ao futuro, "
				+ "responsabilidade pessoal, mentalidade de crescimento, persistência, trabalho em equipe, "
				+ "atenção aos detalhes, proatividade e comunicação";
	}
}
