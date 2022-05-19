package listaDeExercícios;

import java.util.Scanner;

public class SomaQuadrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double n1, n2, soma;
		
		System.out.println("Me dê o valor de N1: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Me dê o valor de N2: ");
		n2 = entrada.nextDouble();
		
		n1 = n1*n1;
		n2 = n2*n2;
		
		soma = n1 + n2;
		
		System.out.println("A soma dos quadrados é " + soma);
		
	}

}
