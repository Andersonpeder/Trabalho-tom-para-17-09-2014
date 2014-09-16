package logica;

import javax.swing.JOptionPane;

public class Exercício5 {
	public static void main (String args []){
		
		String impressão = "";
		Integer [] Tabuada = new Integer [11];
		String NumeroDigitado = JOptionPane.showInputDialog("DIGITE UM NUMERO ENTRE 1 E 10 PARA CALCULAR A TABUADA ");
		
		int Num = Integer.parseInt(NumeroDigitado);
		
		if (Num <= 0 || Num > 10){
			JOptionPane.showMessageDialog(null, "NUMERO INVÁLIDO");
		}else{
			
		
		for (int i = 1; i< Tabuada.length; i++){
			
			Tabuada [i] = Num * i;
			 impressão   +=  Num + "x"+ i + " = " +Tabuada [i]+ "      ";
			
		}
		JOptionPane.showMessageDialog(null, impressão);
	 }
}
}
