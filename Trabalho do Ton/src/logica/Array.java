package logica;

import javax.swing.JOptionPane;

public class Array {
	
	public static void main (String args []){
	
	Integer [] numeros =new Integer [10];
	
	String numeros1 = "";
	String numeroUsuario = "";
	boolean fim = false;
	
	for (int i = 0; i < numeros.length; i++){
		
		numeros[i] = i;
		
		numeros1 += i+ "-";
		
		
	}
	JOptionPane.showMessageDialog(null,"A sequencia de numeros existentes é:" +numeros1);
	numeroUsuario = JOptionPane.showInputDialog("Digite um numero para ser procurado!");
	
		int numeroDigitado =Integer.parseInt(numeroUsuario);

         		for(int i = 0; i<numeros.length;i++){
         			
         			if( numeroDigitado == numeros[i]){
         				
         				JOptionPane.showMessageDialog(null," Numero  encontrado: " + numeroUsuario);	
         				fim = true;
         			}
         			
         			
         		}
				if (fim == false){
         		JOptionPane.showMessageDialog(null," Numero não encontrado: " + numeroUsuario);
         		
         		}
			    
		}

	
	
}
	

