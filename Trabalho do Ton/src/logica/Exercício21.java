package logica;

import java.util.Scanner;

public class Exerc�cio21 {

	
	 public static void main(String[] args) {  
	        Scanner entrada = new Scanner (System.in);  
	          
	        System.out.println("Informe n�mero o total de eleitores: ");  
	        int totaleleitores = Integer.parseInt(entrada.nextLine());  
	          
	        System.out.println("Informe o n�mero de votos brancos: ");  
	        int brancos = Integer.parseInt(entrada.nextLine());  
	          
	        System.out.println("Informe o n�mero de votos nulos: ");  
	        int nulos = Integer.parseInt(entrada.nextLine());  
	          
	        System.out.println("Informe o n�mero de votos v�lidos: ");  
	        int validos = Integer.parseInt(entrada.nextLine());  
	          
	        float percentualbrancos = ( ( (float) brancos/totaleleitores)*100);  
	        float percentualnulos = ( ( (float) nulos/totaleleitores)*100);  
	        float percentualvalidos = ( ( (float) validos/totaleleitores)*100);  
	          
	          
	        System.out.println("Percentual de votos BRANCOS em rela��o ao total de votos: "+percentualbrancos+"%");  
	        System.out.println("Percentual de votos NULOS em rela��o ao total de votos: "+percentualnulos+"%");  
	        System.out.println("Percentual de votos V�LIDOS em rela��o ao total de votos: "+percentualvalidos+"%");  
	    }  
	  
}
