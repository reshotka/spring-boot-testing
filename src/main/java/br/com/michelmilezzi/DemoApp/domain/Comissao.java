package br.com.michelmilezzi.DemoApp.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Comissao extends Vendedor {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull
	private Vendedor vendedor;
	 
	@NotNull
	private BigDecimal valorVenda;
	
	public Comissao (final Vendedor vendedor, final Double valorVenda) {
		this.valorVenda = BigDecimal.ZERO;
		this.vendedor = vendedor;
	}

	public Long getId() {
		return id;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public BigDecimal getValorVenda() {
		return valorVenda;
	}
	
	public void getPercentual (Double valorVenda)  {
		
		if (valorVenda < 5000) {
			
			
			
		}
		
	}
	
	 

}
