package br.com.biblioteca_copacabana.livro.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.biblioteca_copacabana.livro.dto.MensagemErro;
import br.com.biblioteca_copacabana.livro.model.Livro;
import br.com.biblioteca_copacabana.livro.repo.LivroRepo;

@RestController
public class LivroController {

	@Autowired
	private LivroRepo repo;

	@PostMapping("/livros")
	public ResponseEntity<Livro> adicionarNovo(@RequestBody Livro t) {
		Livro liv = repo.save(t);
		if (liv != null) {
			return ResponseEntity.status(201).body(liv);
		}
		return ResponseEntity.badRequest().build();

	}

	@GetMapping("/livros")
	public ArrayList<Livro> recuperarTodos() {
		ArrayList<Livro> lista = (ArrayList<Livro>) repo.findAll();
		return lista;
	}

	@GetMapping("/livros/{id}")
	public ResponseEntity<Livro> recuperarPeloCodigo(@PathVariable int id) {
		Livro l = repo.findById(id).orElse(null);
		if (l != null) {
			return ResponseEntity.ok(l);
		}
		return ResponseEntity.notFound().build();
	}

	@GetMapping("/livros/busca")
	public ResponseEntity<?> buscaPorNome(@RequestParam(name = "palavra") String palavra) {
		ArrayList<Livro> lista = repo.findByTituloContaining(palavra);
		if (lista.size() > 0) {
			return ResponseEntity.ok(lista);
		}
		return ResponseEntity.status(404).body(new MensagemErro(9876, "Criterio de busca não foi satisfeito"));
	}

}
