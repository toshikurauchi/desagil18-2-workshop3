package br.com.kurauchi.desagil.frenteDeCaixa.model;

import java.util.Collections;
import java.util.List;

public class CalculadoraDeTroco {

	private List<Integer> valores;

	public CalculadoraDeTroco(List<Integer> valores) {
		// Valores em CENTAVOS
		this.valores = valores;
		Collections.sort(this.valores, Collections.reverseOrder());
	}

	public Troco calculaTroco(int total, int recebido) {
		// PREENCHA ESSA FUNÇÃO COM O SEU CÓDIGO
		return new Troco();
	}

}
