package logica;

import javax.swing.JOptionPane;

public class Exercício4 {
	public static void main (String args []){
		
	String impressão = "";
	Integer [] Tabuada = new Integer [11];
	
	for (int i = 1; i< Tabuada.length; i++){
		
		Tabuada [i] = 8 * i;
		 impressão   +=  "  | 8 x " +i +"="+ Tabuada [i];
		
	}
	JOptionPane.showMessageDialog(null, impressão);
 }
}