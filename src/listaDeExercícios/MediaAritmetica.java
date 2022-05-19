package listaDeExercícios;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		
		float num1 = 0;
		float num2 = 0;
		float num3 = 0;
		float num4 = 0;
		float soma = 0;
		float media = 0;
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Me dê o valor de N1:");
	
	num1 = entrada.nextFloat();
	
	System.out.println("Me dê o valor de N2:");
	
	num2 = entrada.nextFloat();
	
	System.out.println("Me dê o valor de N3:");
	
	num3 = entrada.nextFloat();
	
	System.out.println("Me dê o valor de N4:");
	
	num4 = entrada.nextFloat();
	
	soma = num1+num2 +num3 +num4;
	media = soma / 4;
	
	System.out.println("A média é: " + media);
	
	}

}
