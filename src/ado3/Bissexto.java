package ado3;

import java.util.Scanner;

public class Bissexto {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Me d� um ano de 4 d�gitos:");
		
		int ano = entrada.nextInt();
		
		if (ano % 400==0 || ano % 4 == 0 && !(ano / 100 == 0)) {
			
			System.out.println("O ano de " + ano + " � bissexto.");
		}else {
			
			System.out.println("O ano de " + ano + " n�o � bissexto.");
		}
		
		entrada.close();
		
	}

}
