package atividade;

import java.util.Scanner;
public class Multiplos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dê um valor inteiro: ");
		int N1 = entrada.nextInt();
		
		int mult1 = N1*1;
		int mult2 = N1*2;
		int mult3 = N1*3;
		
		System.out.println(N1 + " x 1 = " + mult1);
		System.out.println(N1 + " x 2 = " + mult2);
		System.out.println(N1 + " x 3 = " + mult3);
		
		entrada.close();
	}

}
