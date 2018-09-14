package br.com.kurauchi.desagil.frenteDeCaixa.model;

import java.util.Collections;
import java.util.List;

public class CalculadoraDeTroco {

	private List<Integer> valores;

	public CalculadoraDeTroco(List<Integer> valores) {
		this.valores = valores;
		Collections.sort(this.valores, Collections.reverseOrder());
	}

	public Troco calculaTroco(int total, int recebido) {
		int trocoTotal = recebido - total;
		Troco troco = new Troco();
		for (Integer valor : valores) {
			while (valor <= trocoTotal) {
				troco.addQuantidade(valor, 1);
				trocoTotal -= valor;
			}
		}
		return troco;
	}

}
