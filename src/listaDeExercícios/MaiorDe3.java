package listaDeExercícios;

import java.util.Scanner;

public class MaiorDe3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float n1, n2, n3;
		
		System.out.println("N1: ");
		n1 = entrada.nextFloat();
		
		System.out.println("N2: ");
		n2 = entrada.nextFloat();
		
		System.out.println("N3: ");
		n3 = entrada.nextFloat();
				
		if (n1 > n2 && n1>n3) {
			System.out.println(n1 + " é o maior número entre " + n1 + ", " + n2 + " e " + n3);
		}else if (n2>n1 && n2>n3) {
			System.out.println(n2 + " é o maior número entre " + n1 + ", " + n2 + " e " + n3);
		}else {
			System.out.println(n3 + " é o maior número entre " + n1 + ", " + n2 + " e " + n3);
		}

	}

}
