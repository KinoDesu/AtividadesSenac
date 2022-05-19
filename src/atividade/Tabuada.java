package atividade;

import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nos dê um valor inteiro de 1 até 10: ");
		int Num = entrada.nextInt();
		
		if(Num > 0 && (Num <= 10)) {
		
		System.out.println("A tabuada de " + Num + " é:");
		
		System.out.println(Num + " x 1 = " + Num*1);
		System.out.println(Num + " x 2 = " + Num*2);
		System.out.println(Num + " x 3 = " + Num*3);
		System.out.println(Num + " x 4 = " + Num*4);
		System.out.println(Num + " x 5 = " + Num*5);
		System.out.println(Num + " x 6 = " + Num*6);
		System.out.println(Num + " x 7 = " + Num*7);
		System.out.println(Num + " x 8 = " + Num*8);
		System.out.println(Num + " x 9 = " + Num*9);
		System.out.println(Num + " x 10 = " + Num*10);
		
		}else {
			System.out.println("O valor deve ser de 0 até 10.");
		}
		entrada.close();

	}

}
