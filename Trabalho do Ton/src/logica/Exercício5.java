package logica;

import javax.swing.JOptionPane;

public class Exerc�cio5 {
	public static void main (String args []){
		
		String impress�o = "";
		Integer [] Tabuada = new Integer [11];
		String NumeroDigitado = JOptionPane.showInputDialog("DIGITE UM NUMERO ENTRE 1 E 10 PARA CALCULAR A TABUADA ");
		
		int Num = Integer.parseInt(NumeroDigitado);
		
		if (Num <= 0 || Num > 10){
			JOptionPane.showMessageDialog(null, "NUMERO INV�LIDO");
		}else{
			
		
		for (int i = 1; i< Tabuada.length; i++){
			
			Tabuada [i] = Num * i;
			 impress�o   +=  Num + "x"+ i + " = " +Tabuada [i]+ "      ";
			
		}
		JOptionPane.showMessageDialog(null, impress�o);
	 }
}
}
