package logica;

import javax.swing.JOptionPane;

public class Exercicio2 {
	
	public static void main (String args []){
		
		
		String coleta = JOptionPane.showInputDialog("DIGITE O NUMERO DE MA��S COMPRADAS");
		
		int ColetaNum = Integer.parseInt(coleta);
		
		if (ColetaNum < 12 ){
			
			JOptionPane.showMessageDialog(null, " VOC� COMPROU "+ ColetaNum + " MA��S");
			
			double  Calculo = (ColetaNum * 1.3);
			
			JOptionPane.showMessageDialog(null, " O VALOR DE SUA COMPRA �: R$ " + Calculo + " REAIS");
		
		}else{
				
			if(ColetaNum >= 12){
				
				JOptionPane.showMessageDialog(null, " VOC� COMPROU "+ ColetaNum + " MA��S");
				
				double  Calculo = (ColetaNum * 1.0);
				
				JOptionPane.showMessageDialog(null, " O VALOR DE SUA COMPRA �: R$ " + Calculo + " REAIS");
				
			}
			
		}
		
	}

}
