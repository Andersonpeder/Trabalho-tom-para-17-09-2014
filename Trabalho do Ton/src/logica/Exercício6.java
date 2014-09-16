package logica;

import javax.swing.JOptionPane;

public class Exercício6 {
	
public static void main (String args []){
		
		
		double Valor = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DO VEÍCULO "));
		
		
		double TotalImpostos = (Valor * 0.73);
		
		double TotalGeral = Valor + TotalImpostos;
		
		JOptionPane.showMessageDialog(null, "O VALOR DO VEÍCULO É = " + TotalGeral + "00 REAIS");

}
}
