package br.com.kurauchi.desagil.frenteDeCaixa.view;

import java.awt.Font;
import java.awt.Label;
import java.text.DecimalFormat;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import br.com.kurauchi.desagil.frenteDeCaixa.model.Troco;

// Componente criada especialmente para o projeto, que é
// basicamente um JPanel de tamanho fixo. Fixar tamanho
// geralmente não é considerada uma boa prática de design
// de interface, mas fazemos isso aqui por simplicidade.
public class TrocoView extends JPanel {
	private static final long serialVersionUID = 1L;

	// O construtor recebe a largura e a altura do painel.
	public TrocoView(Troco troco) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		Font monospaced = new Font(Font.MONOSPACED, Font.PLAIN, 12);
		for(int valor : troco.getValores()) {
			String valorStr = formataDinheiro(valor);
			String quantidadeStr = Integer.toString(troco.getQuantidade(valor));
			Label label = new Label("R$ " + valorStr + ": " + quantidadeStr);
			label.setFont(monospaced);
			add(label);
		}
		
		Label label = new Label("Total: R$ " + formataDinheiro(troco.getTotal()));
		label.setFont(monospaced);
		add(new Label());
		add(label);
	}

	private String formataDinheiro(int valor) {
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		String valorStr = String.format("%6s", decimalFormat.format(valor / 100.0));
		return valorStr;
	}
}