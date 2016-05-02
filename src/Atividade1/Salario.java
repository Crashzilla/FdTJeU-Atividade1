package Atividade1;

import javax.swing.JOptionPane;

public class Salario {
	
	public static void main (String [] args){
		
		Integer quant = new Integer	(JOptionPane.showInputDialog("Digite a quantidade de funcionários."));
		double [] salario = new double[quant];
		double soma = 0;
		double media;
		
		for (int i=0; i<salario.length; i++){
			
			Double valor = new Double (JOptionPane.showInputDialog("Digite o salário do funcionário "+(i+1)));
			salario[i] = valor;
			soma += valor;
			
		}
		
		media = soma/salario.length;
		
		System.out.println("A média salarial é "+media);
	}
}
