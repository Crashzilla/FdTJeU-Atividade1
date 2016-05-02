package Atividade1;

import javax.swing.JOptionPane;

public class Calculadora {
	
	public static void main (String [] args){
		
		Double valor1;
		Double valor2;
		String operador;
		
		valor1 = new Double (JOptionPane.showInputDialog("Digite o primeiro valor."));
		operador = JOptionPane.showInputDialog("Digite o operador.");
		valor2 = new Double (JOptionPane.showInputDialog("Digite o segundo valor."));
		
		switch (operador){
		
		case "+":
			System.out.println(valor1+valor2);
			break;
		case "/":
			System.out.println(valor1/valor2);
			break;
		case "*":
			System.out.println(valor1*valor2);
			break;
		case "-":
			System.out.println(valor1-valor2);
			break;
		default:
			System.out.println("Operador não reconhecido.");		
		}
	}
}
