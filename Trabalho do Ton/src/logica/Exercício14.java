package logica;

import java.util.Scanner;

public class Exerc�cio14 {
	
	public static void main(String[] args)
	{
		Scanner num = new Scanner(System.in);
		System.out.println("Programa de Ordena��o de 10 n�meros inteiro");
		
		int i;
		int[] v; 
		v = new int[10];
		
		for (i = 0; i < v.length; i++)
		{
			System.out.printf("Digite o %d� numero: ", i+1);
			v[i] = num.nextInt();
		}
		
		v = bubble(v);
		for (i = 0; i < v.length; i++) 
		{ 
			System.out.println(v[i]);
		}
	}
	private static int[] bubble(int v[])
	{ 
		int x, i, j;
		for (i = 0; i < v.length; i++)
	 	{ 
			for (j = i + 1; j < v.length; j++)
			{ 
				if (i != j) 
			{ 
				if (v[i] > v[j]) 
				{ 
					x = v[i]; 
					v[i] = v[j]; 
					v[j] = x; 
				} 
			} 
		} 
	} 
	return v; 
	} 
	

}
