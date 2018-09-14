package br.com.kurauchi.desagil.frenteDeCaixa.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Troco {
	private Map<Integer, Integer> valor2quantidade;

	public Troco() {
		this.valor2quantidade = new HashMap<Integer, Integer>();	
	}
	
	public int getQuantidade(int valor) {
		if (valor2quantidade.containsKey(valor)) {
			return valor2quantidade.get(valor); 
		}
		return 0;
	}
	
	public void addQuantidade(int valor, int quantidade) {
		quantidade += getQuantidade(valor);
		valor2quantidade.put(valor, quantidade);
		if (quantidade == 0) {
			valor2quantidade.remove(valor);
		}
	}
	
	public int getTotal() {
		int total = 0;
		for(Map.Entry<Integer, Integer> entry : valor2quantidade.entrySet()) {
			total += entry.getKey() * entry.getValue();
		}
		return total;
	}

	public List<Integer> getValores() {
		ArrayList<Integer> valores = new ArrayList<>(valor2quantidade.keySet());
		Collections.sort(valores, Collections.reverseOrder());
		return valores;
	}
}
