package listaDeExercícios;

import java.util.Scanner;

public class SalárioComVendas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
			String nome = "";
			double salarioFixo = 0;
			double nVendas = 0;
			double salario = 0;
			double salarioVendas = 0;
			
			System.out.println("Nome do funcionário:");
			nome = entrada.nextLine();
			
			System.out.println("Salário fixo:");
			salarioFixo = entrada.nextDouble();
			
			System.out.println("Vendas realizada (em reais):");
			nVendas = entrada.nextDouble();
			
			salarioVendas = 0.15 * nVendas;
			salario = salarioVendas + salarioFixo;
			
	 		System.out.println("Funcionário " + nome + ", seu salário nesse mês é de R$ " + salario);
	 		
	}

}
