package calculadora;

import javax.swing.*;
import java.awt.event.*;

public class MiniCalculadora extends JFrame implements ActionListener {
	private JTextField operando1, operando2, resultado;
	private JButton restar, sumar, multiplicar, dividir, cerrar;
	private JLabel titulo, texto1, texto2, result;

	public MiniCalculadora() {
		setLayout(null);
		
		operando1 = new JTextField();
		operando1.setBounds(100, 100, 100, 20);
		add(operando1);
		operando2 = new JTextField();
		operando2.setBounds(100, 130, 100, 20);
		add(operando2);
		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setBounds(100, 160, 100, 20);
		add(resultado);
		// Botones
		
		//Sumar
		sumar = new JButton("Sumar");
		sumar.setBounds(220, 160, 100, 50);
		add(sumar);
		sumar.addActionListener(this);
		
		//Restar
		restar = new JButton("Restar");
		restar.setBounds(220, 100, 100, 50);
		add(restar);
		restar.addActionListener(this);
		
		//Multiplicar
		multiplicar = new JButton("Multiplicar");
		multiplicar.setBounds(220, 220, 100, 50);
		add(multiplicar);
		multiplicar.addActionListener(this);
		
		//Dividir
		dividir = new JButton("Dividir");
		dividir.setBounds(220, 280, 100, 50);
		add(dividir);
		dividir.addActionListener(this);
		
		//Salir
		cerrar = new JButton("Salir");
		cerrar.setBounds(100, 280, 100, 50);
		add(cerrar);
		cerrar.addActionListener(this);

		// Texto
		titulo = new JLabel("Calculadora");
		titulo.setBounds(130, 40, 200, 30);
		add(titulo);

		texto1 = new JLabel("Primer Valor: ");
		texto1.setBounds(10, 95, 200, 30);
		add(texto1);

		texto2 = new JLabel("Segundo Valor: ");
		texto2.setBounds(10, 125, 200, 30);
		add(texto2);

		result = new JLabel("Resultado: ");
		result.setBounds(10, 155, 200, 30);
		add(result);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == restar) {
			String oper1 = operando1.getText();
			String oper2 = operando2.getText();
			int num1 = Integer.parseInt(oper1);
			int num2 = Integer.parseInt(oper2);
			int resul = num1 - num2;
			String total = String.valueOf(resul);
			resultado.setText(total);
		}
		if (e.getSource() == sumar) {
			String oper1 = operando1.getText();
			String oper2 = operando2.getText();
			int num1 = Integer.parseInt(oper1);
			int num2 = Integer.parseInt(oper2);
			int resul = num1 + num2;
			String total = String.valueOf(resul);
			resultado.setText(total);
		}
		if (e.getSource() == multiplicar) {
			String oper1 = operando1.getText();
			String oper2 = operando2.getText();
			int num1 = Integer.parseInt(oper1);
			int num2 = Integer.parseInt(oper2);
			int resul = num1 * num2;
			String total = String.valueOf(resul);
			resultado.setText(total);
		}
		if (e.getSource() == dividir) {
			String oper1 = operando1.getText();
			String oper2 = operando2.getText();
			int num1 = Integer.parseInt(oper1);
			int num2 = Integer.parseInt(oper2);
			int resul = num1 / num2;
			String total = String.valueOf(resul);
			resultado.setText(total);
		}

		if (e.getSource() == cerrar) {
			System.exit(0);
		}
	}
}

