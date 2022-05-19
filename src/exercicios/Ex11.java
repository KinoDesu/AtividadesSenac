package exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);

		float soma=0, somaTotal=0;
		float i=1;
		int num=0;
		
		System.out.println("Me dê o valor final:");
		num = entrada.nextInt();
		
		while(i<=num) {
			soma=1/i;
			somaTotal=soma+somaTotal;
			i++;
			
		}
		System.out.println("total: " + somaTotal);

	}

}
