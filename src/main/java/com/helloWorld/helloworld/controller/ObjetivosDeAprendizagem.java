package com.helloWorld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivosdeaprendizagem")

public class ObjetivosDeAprendizagem {

	@GetMapping("/objetivosdeaprendizagem")
	public String objetivosdeaprendizagem() {
		return "Ter mais disciplina e me aprofundar mais em Spring\n"
				+ "Aprimorar minha atenção\n"
				+ "Me dedicar mais aos Cookbooks";
	}
}