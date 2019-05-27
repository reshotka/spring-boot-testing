package br.com.michelmilezzi.DemoApp.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.michelmilezzi.DemoApp.domain.Comissao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComissaoTeste {
	
	@Autowired
	private Comissao comissao;
	
	@Test
	public  void getPercentual(Double valorVenda) {
		assertThat(comissao.getPercentual()).isEqualTo();
	}
	
	@Test
	public void aplicarComissao(BigDecimal salario , Double percentual) {
		assertThat(comissao.aplicarComissao()).isEqualTo();
	}
	

}