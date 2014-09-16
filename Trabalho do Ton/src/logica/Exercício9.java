package logica;

import javax.swing.JOptionPane;

public class Exercício9 {

	public static void main(String[] args) { 

		Integer hora1, min1, hora2 , min2, horafim = 0, minfim = 0; 
		
		JOptionPane.showMessageDialog(null, " DIGITE SUA IDADE NESSE FORMATO" +
                                                   "    HORA / MINUTOS ");
		hora1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a HORA que começará a palestra")); 
	    min1 = Integer.parseInt(JOptionPane.showInputDialog("Digite os MINUTOS ")); 

	    
	    hora2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a HORA do término da palestra")); 
	    min2 = Integer.parseInt(JOptionPane.showInputDialog("Digite os MINUTOS ")); 

		if (hora1 < 24 && min1 < 59 && hora2 < 24 &&  min2 < 59  ){
			
			 horafim = (hora2 - hora1);
			 minfim = (min2-min1);
			 
			 JOptionPane.showMessageDialog(null, "A DURAÇÃO DA PALESTRA É : " + horafim + " HORAS " + "E" + minfim + " MINUTOS" ); 
				
		}else{
			
		
		
		JOptionPane.showMessageDialog(null, "FORMATO DE HORAS NÃO SUPORTADO" ); 
		
		}
		
}
	
}

