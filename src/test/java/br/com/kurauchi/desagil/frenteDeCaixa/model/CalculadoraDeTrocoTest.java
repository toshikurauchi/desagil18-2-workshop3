package br.com.kurauchi.desagil.frenteDeCaixa.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CalculadoraDeTrocoTest {
	
	private List<Integer> criaValores() {
		List<Integer> valores = new ArrayList<Integer>();
		valores.add(1);
		valores.add(5);
		valores.add(10);
		valores.add(25);
		valores.add(50);
		valores.add(100);
		valores.add(200);
		valores.add(500);
		valores.add(1000);
		valores.add(2000);
		valores.add(5000);
		valores.add(10000);
		
		return valores;
	}
	
	@Test
	void funcionaQuandoTrocoEhZero() {
		List<Integer> valores = criaValores();
		CalculadoraDeTroco calculadora = new CalculadoraDeTroco(valores);
		Troco troco = calculadora.calculaTroco(10000, 10000);
		assertEquals(0, troco.getTotal());
	}

	// USE TEST-DRIVEN DEVELOPMENT (TDD), OU SEJA, IMPLEMENTE PRIMEIRO SEUS TESTES
	// E DEPOIS O CÓDIGO QUE FAZ O TESTE PASSAR
}
