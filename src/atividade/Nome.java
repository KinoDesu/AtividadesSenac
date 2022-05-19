package atividade;

import java.util.Scanner;
public class Nome {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		String nome = entrada.next();
		
		int quant = nome.length();
		
		System.out.println("O nome " + nome + " possui " + quant + " caracteres.");
		
		entrada.close();

	}

}
