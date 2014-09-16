package logica;

import javax.swing.JOptionPane;

public class Exercício7 {

	public static void main(String[] args) { 

		Integer Idade, mes, ano,aux,aux2,mes1, dias; 
		Idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em dias")); 

		mes = Idade % 365; // para achar os meses
		ano = Idade/365;  // para achar os anos
		mes1 = mes/30;
		dias = mes % 30;
		
		
		
		JOptionPane.showMessageDialog(null, ano+" Anos "+ mes1 +" Meses e " + dias + " Dias"); 
		
		
}
	
	
	
}
