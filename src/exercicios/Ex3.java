package exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 0, maior = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.println("Me d� o " + i + "� valor:");

			num = entrada.nextInt();

			if (num < 0) {
				System.err.println("O valor deve ser maior que 0");
			} else {

				if (num > maior) {
					maior = num;
				}
			}
		}
		System.out.println("================================================");
		System.out.printf("%d � o maior n�mero", maior);
		System.out.println("\n===============================================");
	}

}
