package logica;

import javax.swing.JOptionPane;

public class Exerc�cio10 {
	
	public static void main (String args []){
		
		
	
		int posi��o = 0;
		int sair =0;
		
		String [] nomes = new String [15];
		
					sair = Integer.parseInt(JOptionPane.showInputDialog(" PARA SAIR DIGITE !! 1 !! OU PARA INSERIR NOMES DIGITE !! 2 !!"));	 
					
					while (sair != 1){
						
						nomes[posi��o] = JOptionPane.showInputDialog("DIGITE UM NOME PARA ARMAZENAR");
						sair = Integer.parseInt(JOptionPane.showInputDialog(" PARA SAIR DIGITE !! 1 !! OU PARA INSERIR NOMES DIGITE !! 2 !!"));	 
						
						posi��o = posi��o +1;
										
					}
					
					/*for(int i = 0; i< nomes.length; i++){
						//while (nomes[i] != null){
							
						System.out.println(nomes[i]);
					}
					}*/
					
						
					
					
			
	}
}