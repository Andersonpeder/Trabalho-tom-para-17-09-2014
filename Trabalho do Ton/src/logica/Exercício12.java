package logica;

import javax.swing.JOptionPane;

public class Exerc�cio12 {
	
	public static void main (String args []){
		
		
		
		
		
		int[] numeros = new int [50];
		int []  Comparador = new int [50] ;
		int []  Comparado = new int [50] ;
		int comparador = 0;
					for (int i = 0; i < 10; i ++){
						
					
						numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO"));
						
						
					}
					
					while (comparador < 10){
					
						for (int k =0; k< 10; k++){
							
							if (numeros [k] == numeros [k+1]){
							
							Comparador [k]= numeros [k];
							Comparado [k] = numeros [k+1];
							
							System.out.println("Numero: "+ Comparador [k] +" e Numero "+ Comparado [k] + " S�o iguais");	
							
							}
							
							comparador = comparador +1;
				        }
						
					
					
					
			        }
					//JOptionPane.showMessageDialog(null, "N�o h� numeros repetidos");
		}
						
	}



