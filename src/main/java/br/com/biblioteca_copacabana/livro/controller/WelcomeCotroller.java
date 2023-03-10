package br.com.biblioteca_copacabana.livro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeCotroller {
	
	@GetMapping("/")
	public String sayWelcome() {
		return"<pre>"
				+ "Bem vindo à API de livros<br/>"
				+ "Endpoints disponíveis <br/>"
				+ "/livros (GET) - para recuperar tdo <br/>"
				+ "/livros/id (GET) - para recuperar detalhes de um livro<br/>"
				+ "/livros (POST) - para incluir um novo livro</pre>";
	}
}
