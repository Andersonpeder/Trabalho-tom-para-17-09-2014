package logica;

import javax.swing.JOptionPane;

public class Exerc�cio4 {
	public static void main (String args []){
		
	String impress�o = "";
	Integer [] Tabuada = new Integer [11];
	
	for (int i = 1; i< Tabuada.length; i++){
		
		Tabuada [i] = 8 * i;
		 impress�o   +=  "  | 8 x " +i +"="+ Tabuada [i];
		
	}
	JOptionPane.showMessageDialog(null, impress�o);
 }
}