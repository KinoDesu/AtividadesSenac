package listaDeExercícios;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int cadastro = 0;
		double horas = 0;
		double valorHora = 0;
		double salario = 0;
		
		System.out.println("Número de cadastro:");
		cadastro = entrada.nextInt();
		
		System.out.println("horas trabalhadas:");
		horas = entrada.nextDouble();
		
		System.out.println("O valor da sua hora:");
		valorHora = entrada.nextDouble();
		
		salario = valorHora*horas;
		
 		System.out.println("Funcionário Nº " + cadastro + ", seu salário nesse mês é de R$ " + salario);
		

	}

}
