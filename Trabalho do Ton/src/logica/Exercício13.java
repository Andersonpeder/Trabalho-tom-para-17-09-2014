package logica;

import javax.swing.JOptionPane;

public class Exercício13 {
	 public static void main(String[] args) {  
	        int x[] = new int[5];  
	        int y[] = new int[5];  
	        int k[] = new int[10];  
	  
	        for (int i = 0; i < 5; i++) {  
	            x[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º numero"));  
	            k[i] = x[i];  
	        }  
	  
	        for (int j = 0; j < 5; j++) {  
	            y[j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (j + 1) + "ºnumero"));  
	            k[j+1] = y[j];  
	        }  
	       
	       int aux;  
	        for (int i = 0; i < (x.length - 1); i++) {  
	            for (int j = i + 1; j < y.length; j++) {  
	                if (y[j] > x[i]) {  
	                    aux = x[i];  
	                    x[i] = y[j];  
	                    y[j] = aux;  
	                }  
	            }System.out.println(k);  
	        }  
	  
	    }  

}
