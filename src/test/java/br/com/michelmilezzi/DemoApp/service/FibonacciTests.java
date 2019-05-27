package br.com.michelmilezzi.DemoApp.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FibonacciTests {
	
	@Autowired
	private FibonacciService fibonacciService;
	
	@Test
	public void meuPrimeiroFibonacci8() {
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584
		assertThat(fibonacciService.calcularFibonacci(6)).isEqualTo(8L);
	}
	
	@Test
	public void meuPrimeiroFibonacci6() {
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584
		assertThat(fibonacciService.calcularFibonacci(8)).isEqualTo(21L);
	}

}
