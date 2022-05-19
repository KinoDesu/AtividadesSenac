package listaDeExercícios;

import java.util.Scanner;

public class ValorL {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double L, resposta;
		
		System.out.println("Me dê o valor de um dos lados do quadrado: ");
		L= entrada.nextDouble();
		
		resposta = Math.pow(L, 2);
		
		System.out.println("A área do quadrado é igual a " + resposta);

	}

}
