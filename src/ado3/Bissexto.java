package ado3;

import java.util.Scanner;

public class Bissexto {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Me dê um ano de 4 dígitos:");
		
		int ano = entrada.nextInt();
		
		if (ano % 400==0 || ano % 4 == 0 && !(ano / 100 == 0)) {
			
			System.out.println("O ano de " + ano + " é bissexto.");
		}else {
			
			System.out.println("O ano de " + ano + " não é bissexto.");
		}
		
		entrada.close();
		
	}

}
