package logica;

import javax.swing.JOptionPane;

public class Exerc�cio6 {
	
public static void main (String args []){
		
		
		double Valor = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DO VE�CULO "));
		
		
		double TotalImpostos = (Valor * 0.73);
		
		double TotalGeral = Valor + TotalImpostos;
		
		JOptionPane.showMessageDialog(null, "O VALOR DO VE�CULO � = " + TotalGeral + "00 REAIS");

}
}
