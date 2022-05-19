package exercicios;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int cont=1, soma=0;
		
		System.out.println("Dê um valor final");
		int n = entrada.nextInt();
		
		while(cont<=n) {
			
			soma+=cont;
			cont++;
			
		}
		
		System.out.println(soma);

	}
}
