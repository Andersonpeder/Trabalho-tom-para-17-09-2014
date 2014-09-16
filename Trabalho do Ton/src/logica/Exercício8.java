package logica;

import javax.swing.JOptionPane;

public class Exercício8 {
	
	
	public static void main(String[] args) { 

		Integer Idade, meses, anos,mes1, dias; 
		JOptionPane.showMessageDialog(null, " DIGITE SUA IDADE NESSE FORMATO" +
				                                  "    ANOS / MESES / DIAS");
		
		anos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OS ANOS")); 
		meses = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OS MESES")); 
		dias = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OS DIAS")); 
		
		while (meses > 11 || dias > 30){
		
			JOptionPane.showMessageDialog(null, "  FORMATO DE MES INVÁLIDO" );			
		
	}
	
		
		meses = meses * 30; 
		anos = anos * 365;  
		
		Idade = meses + anos + dias;
		
		
		JOptionPane.showMessageDialog(null,   " SUA IDADE É: " + Idade +" DIAS"); 
		
		
}

}
