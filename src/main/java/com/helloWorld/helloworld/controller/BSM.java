package com.helloWorld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BSM {

	@GetMapping("/bsm")
	public String bsm() {
		return "Orientação ao Detalhe\n"
				+ "Mentalidade de Crescimento\n"
				+ "Orientação ao futuro\n"
				+ "Persistência\n"
				+ "Trabalho em equipe\n"
				+ "Responsabilidade Pessoal\r\n"
				+ "Atenção aos detalhes\n"
				+ "Proatividade\n"
				+ "Comunicação";
	}
	
}