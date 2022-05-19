package listaDeExercícios;

import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float num = 0;
		
		System.out.println("Nos dê um número:");
		num = entrada.nextFloat();
		
		if (num < 0) {
			System.out.println("Número negativo");
		}else if (num == 0){
			System.out.println("Número Neutro");
		}else {
			System.out.println("Número Positivo");
		}
		
	}

}
