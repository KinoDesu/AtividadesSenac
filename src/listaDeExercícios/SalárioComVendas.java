package listaDeExerc�cios;

import java.util.Scanner;

public class Sal�rioComVendas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
			String nome = "";
			double salarioFixo = 0;
			double nVendas = 0;
			double salario = 0;
			double salarioVendas = 0;
			
			System.out.println("Nome do funcion�rio:");
			nome = entrada.nextLine();
			
			System.out.println("Sal�rio fixo:");
			salarioFixo = entrada.nextDouble();
			
			System.out.println("Vendas realizada (em reais):");
			nVendas = entrada.nextDouble();
			
			salarioVendas = 0.15 * nVendas;
			salario = salarioVendas + salarioFixo;
			
	 		System.out.println("Funcion�rio " + nome + ", seu sal�rio nesse m�s � de R$ " + salario);
	 		
	}

}
