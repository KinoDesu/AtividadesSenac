package listaDeExerc�cios;

import java.util.Scanner;

public class potencia {

	public static void main(String[] args) {
		
		double base, expo, resposta;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Potencias!\n\n");
		
		System.out.println("me d� o valor da base: ");
		base = entrada.nextDouble();
		
		System.out.println("\nme d� o valor do expoente: ");
		expo = entrada.nextDouble();
		
		resposta= Math.pow(base, expo);
		
		System.out.println("A pot�ncia de " + base + "^" + expo + " � igual a " + resposta);

	}

}
