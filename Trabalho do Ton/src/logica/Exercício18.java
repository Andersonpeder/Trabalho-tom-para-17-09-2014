package logica;

import java.util.Scanner;

public class Exercício18 {
	
	 public static void main(String args[]){  
	       Scanner ler= new Scanner(System.in);  
	            int i;  
	                          
	            int p[] = new int [5];  
	  
	              for(i=0; i<= p.length; i++){  
	                      
	                                            
	System.out.println("Digite um valor para a posição " +i + " do vetor");  
	             p[i]=ler.nextInt();  
	            }  
	  
	              for( i=0; i<=p.length; i++){  
	                if(p[i] ==10){  
	              System.out.println("O valor se encontra na posição " + i);  
	                }else{  
	                  
	              System.out.println("Não existe 30 em nenhuma posição");  
	                    }  
	              }  
	                         
	    }  

}
