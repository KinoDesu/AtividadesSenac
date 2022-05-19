package listaDeExercícios;

import java.util.Scanner;

public class Consecutivos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, n3, n4;
		
		System.out.println("Me dê o valor de N1: ");
		n1 = entrada.nextInt();
		
		System.out.println("Me dê o valor de N2: ");
		n2 = entrada.nextInt();
		
		n3 = n1 + 1;
		n4 = n2 + 1;
		
		System.out.println("Os consecutivos de " + n1 + " e " + n2 + " são " + n3 + " e " + n4);

	}

}
