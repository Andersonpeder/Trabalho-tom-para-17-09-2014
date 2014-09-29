package logica;

import javax.swing.JOptionPane;

public class Exercício27 {
	
	
	    public static void main (String [] Args)
	    {
	        double credito;
	        Integer saldoMedio  = Integer.parseInt(JOptionPane.showInputDialog("Informe seu saldo medio"));

	        if (saldoMedio <= 200)
	        {
	            JOptionPane.showMessageDialog(null,"Saldo medio:"+saldoMedio+" Cliente sem credito");

	        }
	        if (saldoMedio > 200 && saldoMedio <= 400 )
	        {
	            credito = (saldoMedio * 20) / 100;
	            JOptionPane.showMessageDialog(null,"Saldo medio:"+saldoMedio+" saldo do Crédito: "+credito);
	        }
	        if (saldoMedio > 400 && saldoMedio <= 600 )
	        {
	            credito = (saldoMedio * 40) / 100;
	            JOptionPane.showMessageDialog(null,"Saldo medio:"+saldoMedio+" saldo do Crédito: "+credito);
	        }
	        if (saldoMedio > 600)
	        {
	            credito = (saldoMedio * 60) / 100;
	            JOptionPane.showMessageDialog(null,"Saldo medio:"+saldoMedio+" saldo do Crédito: "+credito);
	        }
	    }
	}



