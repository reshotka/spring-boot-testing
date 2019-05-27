package br.com.michelmilezzi.DemoApp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Vendedor {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull
	private String nome;
	 
	@NotNull
	private Double salario;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}
	
	

}
