package listaDeExercícios;

import java.util.Scanner;

public class potencia {

	public static void main(String[] args) {
		
		double base, expo, resposta;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Potencias!\n\n");
		
		System.out.println("me dê o valor da base: ");
		base = entrada.nextDouble();
		
		System.out.println("\nme dê o valor do expoente: ");
		expo = entrada.nextDouble();
		
		resposta= Math.pow(base, expo);
		
		System.out.println("A potência de " + base + "^" + expo + " é igual a " + resposta);

	}

}
