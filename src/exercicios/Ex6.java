package exercicios;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// contadores
		int x = 0, y = 0, i = 1;
		// dados base alunos
		String nome = "";
		char sexo = ' ';
		int idade = 0;

		// dados mais velho
		String nomeVelho = "";
		int maisVelho = 0;
		char sexoVelho = ' ';

		do {

			x = 0;

			System.out.println("Aluno " + i);

			System.out.println("\nNome: ");
			nome = entrada.next();

			// in�cio validador de idade
			do {
				System.out.println("-----------------------------");
				System.out.println("Idade: ");
				idade = entrada.nextInt();

				if (idade <= 0) {
					System.err.println("Valor inv�lido");

				} else {
					x--;
				}

			} while (x >= 0);

			x = 0;

			// final validador de idade

			// in�cio validade sexo
			do {
				System.out.println("-----------------------------");
				System.out.println("Sexo (M/F): ");
				sexo = entrada.next().charAt(0);
				sexo = Character.toUpperCase(sexo);

				switch (sexo) {
				case 'M':

					System.out.println("Masculino");
					x--;
					break;

				case 'F':
					System.out.println("Feminino");
					x--;
					break;
				default:
					System.err.println("Op��o inv�lida");

					break;
				}
			} while (x >= 0);

			// Final validador sexo

			System.out.println("\n==========================================");

			// Validar se � mais velho que o aluno anterior e guardar dados se for mais velho

			if (idade > maisVelho) {
				maisVelho = idade;
				nomeVelho = nome;
				sexoVelho = sexo;

			}

			i++;

		} while (i <= 5);

		System.out.println(
				"O aluno " + nomeVelho + " (" + sexoVelho + "), " + "de " + maisVelho + " anos � o mais velho");

	}

}
