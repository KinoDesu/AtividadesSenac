package ado3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Me d� o valor do 1� lado do tri�ngulo: ");
		
		int a = entrada.nextInt();
		
		System.out.println("Me d� o valor do 2� lado do tri�ngulo: ");
		
		int b = entrada.nextInt();
		
		System.out.println("Me d� o valor do 3� lado do tri�ngulo: ");
		
		int c = entrada.nextInt();
		
		if ((a < b+c) && (b < a+c) && (c < a+b)){
			
		}else{
			
			System.out.println("Esse tir�ngulo n�o � real");
			
			entrada.close();
			
			System.exit(0);
			}
			
		 if (a == b && a == c && c==b) {
				System.out.println("Esse tri�ngulo � real e possui tr�s lados iguais. Portanto � um tri�ngulo Equil�tero");
				
			}else if(a == b || a == c || b == c) {
				
				System.out.println("Esse tri�ngulo � real e possui dois lados iguais. Por isso � um triangulo Is�sceles");
				
			}else if(a!=b && a!=c && b!=c){
				System.out.println("Esse tri�ngulo � real e tem tr�s lados diferentes. Por esse motivo � um tri�ngulo Escaleno");		
		}
	}
}

