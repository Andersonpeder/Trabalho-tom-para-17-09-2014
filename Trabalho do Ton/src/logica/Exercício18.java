package logica;

import java.util.Scanner;

public class Exerc�cio18 {
	
	 public static void main(String args[]){  
	       Scanner ler= new Scanner(System.in);  
	            int i;  
	                          
	            int p[] = new int [5];  
	  
	              for(i=0; i<= p.length; i++){  
	                      
	                                            
	System.out.println("Digite um valor para a posi��o " +i + " do vetor");  
	             p[i]=ler.nextInt();  
	            }  
	  
	              for( i=0; i<=p.length; i++){  
	                if(p[i] ==10){  
	              System.out.println("O valor se encontra na posi��o " + i);  
	                }else{  
	                  
	              System.out.println("N�o existe 30 em nenhuma posi��o");  
	                    }  
	              }  
	                         
	    }  

}
