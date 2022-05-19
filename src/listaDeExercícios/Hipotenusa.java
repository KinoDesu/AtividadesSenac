package listaDeExercícios;

import java.util.Scanner;

public class Hipotenusa {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double ladoA = 0;
		double ladoB = 0;
		double quadA = 0;
		double quadB = 0;
		double hipo = 0;
		double quadrados = 0;
		
		System.out.println("Me dê o valor de um lado: ");
		ladoA = entrada.nextDouble();
		
		System.out.println("Me dê o valor de um lado: ");
		ladoB = entrada.nextDouble();
		
		quadA = Math.pow(ladoA, 2);
		quadB = Math.pow(ladoB, 2);
		
		quadrados = quadB + quadA;
		
		hipo = Math.sqrt(quadrados);
		
		System.out.println("O valor da hipotenusa é " + hipo);
		
	}

}
