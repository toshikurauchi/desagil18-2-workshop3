package br.com.kurauchi.desagil.frenteDeCaixa.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrocoTest {

	@Test
	void trocoEhZeroComNenhumValor() {
		Troco troco = new Troco();
		assertEquals(0, troco .getTotal());
	}
	
	@Test
	void calculaTotalCorretamente() {
		Troco troco = new Troco();
		troco.addQuantidade(1, 3);
		troco.addQuantidade(5, 1);
		troco.addQuantidade(200, 2);
		troco.addQuantidade(2000, 2);
		troco.addQuantidade(10000, 5);
		assertEquals(54408, troco .getTotal());
	}
	
	@Test
	void quantidadeEhZeroQuandoValorNaoExiste() {
		Troco troco = new Troco();
		assertEquals(0, troco .getQuantidade(1));
		assertEquals(0, troco .getQuantidade(5));
		assertEquals(0, troco .getQuantidade(10));
		assertEquals(0, troco .getQuantidade(25));
		assertEquals(0, troco .getQuantidade(50));
		assertEquals(0, troco .getQuantidade(100));
		assertEquals(0, troco .getQuantidade(200));
		assertEquals(0, troco .getQuantidade(500));
		assertEquals(0, troco .getQuantidade(1000));
		assertEquals(0, troco .getQuantidade(2000));
		assertEquals(0, troco .getQuantidade(5000));
		assertEquals(0, troco .getQuantidade(10000));
	}	

}
