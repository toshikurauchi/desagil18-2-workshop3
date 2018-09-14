package br.com.kurauchi.desagil.frenteDeCaixa.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import br.com.kurauchi.desagil.frenteDeCaixa.model.CalculadoraDeTroco;
import br.com.kurauchi.desagil.frenteDeCaixa.model.Troco;

public class View extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private CalculadoraDeTroco calculadoraDeTroco;

	private JTextField campoValorTotal;
	private JTextField campoValorRecebido;
	private JButton botaoCalcular;
	private TrocoView trocoView;

	public View(CalculadoraDeTroco calculadoraDeTroco) {
		this.calculadoraDeTroco = calculadoraDeTroco;
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		campoValorTotal = new JTextField();
		campoValorRecebido = new JTextField();
		
		add(new JLabel("Valor Total:"));
		add(campoValorTotal);
		add(new JLabel("Valor Recebido:"));
		add(campoValorRecebido);
		
		botaoCalcular = new JButton();
		botaoCalcular.setText("Calcular Troco");
		botaoCalcular.addActionListener(this);
		add(botaoCalcular);
		
		trocoView = new TrocoView(new Troco());
		add(trocoView);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		remove(trocoView);
		
		int total = 0;
		int recebido = 0;
		
		try {
			total = Integer.parseInt(campoValorTotal.getText());
			recebido = Integer.parseInt(campoValorRecebido.getText());
		} catch (NumberFormatException e) {
		}
		
		Troco troco = new Troco();
		if (recebido >= total) {
			troco = calculadoraDeTroco.calculaTroco(total, recebido);
		}
		
		trocoView = new TrocoView(troco);
		add(trocoView);

		// Linha necessária para evitar um bug gráfico.
		((JFrame) SwingUtilities.getRoot(this)).pack();
	}
}