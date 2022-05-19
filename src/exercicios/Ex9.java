package exercicios;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int alunos = 0, i = 1;
		double media = 0, soma = 0, somaTotal = 0, mediaTotal = 0;

		System.out.println("Digite o número de alunos: ");
		alunos = entrada.nextInt();

		while (i <= alunos) {
			System.out.println("================================");
			System.out.println("Aluno " + i);
			System.out.println("================================");
			System.out.print("Nota 1: ");
			double n1 = entrada.nextDouble();
			System.out.println("================================");
			System.out.print("Nota 2: ");
			double n2 = entrada.nextDouble();

			soma = n1 + n2;
			somaTotal = soma + somaTotal;

			i++;

		}
		System.out.println("===============================");
		System.err.println("Soma total das notas: " + somaTotal);

		mediaTotal = somaTotal / (alunos * 2);

		System.out.println("===============================");
		System.out.println("Média total = " + somaTotal + " / " + alunos*2);
		System.out.println("Média total = " + mediaTotal);

	}

}
