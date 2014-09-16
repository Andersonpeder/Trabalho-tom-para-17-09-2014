package logica;

import javax.swing.JOptionPane;

public class Exercício3 {
	
public static void main (String args []){
		
		
		String coleta = JOptionPane.showInputDialog("DIGITE A IDADE DO NADADOR PARA CLASSIFICA-LO ");
		
		int Num = Integer.parseInt(coleta);
		
		if (Num < 5){
			
			JOptionPane.showMessageDialog(null,"CRIANÇA MENOR DE 5 ANOS NÃO SE CLASSIFICA ");
		}else{
			
			if (Num >= 5 && Num <= 7){
				
				JOptionPane.showMessageDialog(null,"CLASSIFICAÇÃO INFANTIL A ");
			}else{
			
			if (Num > 7 && Num <= 10){
				
				JOptionPane.showMessageDialog(null,"CLASSIFICAÇÃO INFANTIL B");
			}else{
				
				if (Num >10 && Num <= 13){
					
					JOptionPane.showMessageDialog(null,"CLASSIFICAÇÃO JUVENIL A ");
				}else{
					
					if (Num >13 && Num <= 17){
						
						JOptionPane.showMessageDialog(null,"CLASSIFICAÇÃO JUVENIL B ");
					}else{
						
						JOptionPane.showMessageDialog(null,"CLASSIFICAÇÃO ADULTO ");
					}
				}
			}
		}

	}
}
}