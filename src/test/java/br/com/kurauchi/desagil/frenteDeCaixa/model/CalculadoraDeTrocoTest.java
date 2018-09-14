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
	
	@Test
	void devolveTrocoDeUmCentavo() {
		List<Integer> valores = criaValores();
		CalculadoraDeTroco calculadora = new CalculadoraDeTroco(valores);
		Troco troco = calculadora.calculaTroco(99, 100);
		assertEquals(1, troco.getTotal());
		assertEquals(1, troco.getQuantidade(1));
	}
	
	@Test
	void devolveTrocoCorreto() {
		CalculadoraDeTroco calculadora = new CalculadoraDeTroco(criaValores());
		Troco troco = calculadora.calculaTroco(7543, 10000);
		assertEquals(2457, troco.getTotal());
		assertEquals(2, troco.getQuantidade(1));
		assertEquals(1, troco.getQuantidade(5));
		assertEquals(1, troco.getQuantidade(50));
		assertEquals(2, troco.getQuantidade(200));
		assertEquals(1, troco.getQuantidade(2000));
	}

}
