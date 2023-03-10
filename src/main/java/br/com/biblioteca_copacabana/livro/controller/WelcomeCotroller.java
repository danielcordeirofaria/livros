package br.com.biblioteca_copacabana.livro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeCotroller {
	
	@GetMapping("/")
	public String sayWelcome() {
		return"<pre>"
				+ "<h1>Bem vindo à API de livros<br/><h1/>"
				+ "<h2>Endpoints disponíveis <br/><h2/>"
				+ "<h2>/livros (GET) - para recuperar tdo <br/><h2/>"
				+ "<h2>/livros/id (GET) - para recuperar detalhes de um livro<br/><h2/>"
				+ "<h2>/livros (POST) - para incluir um novo livro</pre><h2/>";
	}
}
