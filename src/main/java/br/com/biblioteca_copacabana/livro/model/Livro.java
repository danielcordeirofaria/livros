package br.com.biblioteca_copacabana.livro.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "livros")
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "titulo", nullable = false, length = 100)
	private String titulo;
	
	@Column(name = "autor", nullable = false, length = 100)
	private String autor;
	
	@Column(name = "ano", nullable = false)
	private int ano;
	
	@Column(name = "genero", nullable = false, length = 20)
	private String genero;

	public Livro() {
		super();
	}

//	public Livro(int id, String titulo, String autor, int ano, String genero) {
//		super();
//		this.id = id;
//		this.titulo = titulo;
//		this.autor = autor;
//		this.ano = ano;
//		this.genero = genero;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
