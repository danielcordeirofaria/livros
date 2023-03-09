package br.com.biblioteca_copacabana.livro.repo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.biblioteca_copacabana.livro.model.Livro;

public interface LivroRepo extends CrudRepository<Livro, Integer>{
	
//	public ArrayList<Livro> recuperarTodos();

//	public Livro recuperarPeloCodigo(int codigo);

	public ArrayList<Livro> findByTituloContaining(String palavra);

//	public Livro adicionarNovo(Livro t); 
	
}
