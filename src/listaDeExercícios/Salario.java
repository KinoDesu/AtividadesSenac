package listaDeExerc�cios;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int cadastro = 0;
		double horas = 0;
		double valorHora = 0;
		double salario = 0;
		
		System.out.println("N�mero de cadastro:");
		cadastro = entrada.nextInt();
		
		System.out.println("horas trabalhadas:");
		horas = entrada.nextDouble();
		
		System.out.println("O valor da sua hora:");
		valorHora = entrada.nextDouble();
		
		salario = valorHora*horas;
		
 		System.out.println("Funcion�rio N� " + cadastro + ", seu sal�rio nesse m�s � de R$ " + salario);
		

	}

}
