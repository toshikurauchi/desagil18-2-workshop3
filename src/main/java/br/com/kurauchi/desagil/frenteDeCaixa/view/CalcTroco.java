package br.com.kurauchi.desagil.frenteDeCaixa.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import br.com.kurauchi.desagil.frenteDeCaixa.model.CalculadoraDeTroco;

public class CalcTroco {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				List<Integer> valores = new ArrayList<>();
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

				View view = new View(new CalculadoraDeTroco(valores));

				JFrame frame = new JFrame();
				frame.setContentPane(view);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setResizable(false);
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}
