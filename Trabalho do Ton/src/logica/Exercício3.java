package logica;

import javax.swing.JOptionPane;

public class Exerc�cio3 {
	
public static void main (String args []){
		
		
		String coleta = JOptionPane.showInputDialog("DIGITE A IDADE DO NADADOR PARA CLASSIFICA-LO ");
		
		int Num = Integer.parseInt(coleta);
		
		if (Num < 5){
			
			JOptionPane.showMessageDialog(null,"CRIAN�A MENOR DE 5 ANOS N�O SE CLASSIFICA ");
		}else{
			
			if (Num >= 5 && Num <= 7){
				
				JOptionPane.showMessageDialog(null,"CLASSIFICA��O INFANTIL A ");
			}else{
			
			if (Num > 7 && Num <= 10){
				
				JOptionPane.showMessageDialog(null,"CLASSIFICA��O INFANTIL B");
			}else{
				
				if (Num >10 && Num <= 13){
					
					JOptionPane.showMessageDialog(null,"CLASSIFICA��O JUVENIL A ");
				}else{
					
					if (Num >13 && Num <= 17){
						
						JOptionPane.showMessageDialog(null,"CLASSIFICA��O JUVENIL B ");
					}else{
						
						JOptionPane.showMessageDialog(null,"CLASSIFICA��O ADULTO ");
					}
				}
			}
		}

	}
}
}