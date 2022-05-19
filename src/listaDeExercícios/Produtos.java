package listaDeExercícios;

import java.util.Scanner;

public class Produtos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	float n1, n2, resultado;
	
	System.out.println("valor de N1: ");
	 n1=entrada.nextFloat();
	 
	 System.out.println("valor de N2: ");
	 n2=entrada.nextFloat();
	 
	 resultado = n1*n2;
	 
	 System.out.println(" O produto desses 2 números é " + resultado);

	}

}
