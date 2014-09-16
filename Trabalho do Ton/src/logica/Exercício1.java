package logica;

import javax.swing.JOptionPane;

public class Exercício1 {
	
	public static void main (String args []){
		
		
		String coleta = JOptionPane.showInputDialog("DIGITE O NUMERO DE MAÇÃS COMPRADAS");
		
		int ColetaNum = Integer.parseInt(coleta);
		
		if (ColetaNum < 12 ){
			
			JOptionPane.showMessageDialog(null, " VOCÊ COMPROU "+ ColetaNum + " MAÇÃS");
			
			double  Calculo = (ColetaNum * 1.3);
			
			JOptionPane.showMessageDialog(null, " O VALOR DE SUA COMPRA É: R$ " + Calculo + " REAIS");
		
		}else{
				
			if(ColetaNum >= 12){
				
				JOptionPane.showMessageDialog(null, " VOCÊ COMPROU "+ ColetaNum + " MAÇÃS");
				
				double  Calculo = (ColetaNum * 1.0);
				
				JOptionPane.showMessageDialog(null, " O VALOR DE SUA COMPRA É: R$ " + Calculo + " REAIS");
				
			}
			
		}
		
	}

}
