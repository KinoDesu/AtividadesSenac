package exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);

		float soma=0, somaTotal=0;
		float i=1, coe=0;
		float num=0;
		
		System.out.println("Me dê o valor de N:");
		num = entrada.nextInt();
		float deno=num;
		
		while(i<=num) {
			soma=i/deno;
			somaTotal=soma+somaTotal;
			deno--;
			i++;
			
		}
		System.out.println("total: " + somaTotal);

	}

}
