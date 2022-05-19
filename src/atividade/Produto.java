package atividade;

import java.util.Scanner;
public class Produto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 3 número reais.");
		
		System.out.println("Número 1: ");
		Float N1 = entrada.nextFloat();
		
		System.out.println("Número 2: ");
		Float N2 = entrada.nextFloat();
		
		System.out.println("Número 3: ");
		Float N3 = entrada.nextFloat();
		
		Float produto = N1*N2*N3;
		
		System.out.println("O produto desses valores é " + produto);
		
		entrada.close();
		
	}

}
