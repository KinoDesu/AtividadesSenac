package ado10;

import java.util.Random;
import java.util.Scanner;

public class JogoDoNumero {

	public static void main(String[] args) {

		int max = 100;
		int i;
		Random aleatorio = new Random();

		int numeroJogo = aleatorio.nextInt(max) + 1;

		Scanner entrada = new Scanner(System.in);

		for (i=5; i > 0; i--) {

			System.out.println("Vidas: " + i + "/5");

			System.out.println("\nQual � o n�mero?");
			int numeroJogador = entrada.nextInt();
			System.out.println("______________________________________________________\n");
			if (numeroJogador == (numeroJogo + 1) || numeroJogador == (numeroJogo - 1)) {
				System.out.println("T� QUENTE!!");
				System.out.println("\n==================================================\n");
			} else if (numeroJogador > numeroJogo) {
				System.out.println("Seu n�mero � maior");
				System.out.println("\n==================================================\n");
			} else if (numeroJogador < numeroJogo) {
				System.out.println("Seu n�mero � menor");
				System.out.println("\n==================================================\n");
			} else if (numeroJogador == numeroJogo) {
				System.out.println("Parab�ns!! Voc� ganhou o jogo!");
				System.out.println("\n==================================================\n");
				break;

			}

		}
		if (i == 0) {
			System.err.println("GAME OVER!");
		}
	}

}
