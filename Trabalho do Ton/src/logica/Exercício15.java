package logica;

import java.util.Arrays;

public class Exercício15 {
	
	public static void main(String[] args){
	    int[] valores = new int[5];
	 
	    // inicializa os elementos do array
	    valores[0] = 23;
	    valores[1] = 65;
	    valores[2] = 2;
	    valores[3] = 87;
	    valores[4] = 34;
		
	    // ordena os valores
	    Arrays.sort(valores);
	    inverter(valores);

	    // exibe os valores dos elementos do array
	    // usando o laço for melhorado
	    for(int valor : valores){
	      System.out.println(valor);  
	    }
	  
	    System.exit(0);
	  }

	  public static void inverter(int[] b){
	    int left = 0;
	    int right = b.length-1;
	  
	    while (left < right) {
	      int temp = b[left]; 
	      b[left]  = b[right]; 
	      b[right] = temp;
	     
	      left++;
	      right--;
	    }
	  } 

}
