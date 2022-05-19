package ado3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Me dê o valor do 1º lado do triângulo: ");
		
		int a = entrada.nextInt();
		
		System.out.println("Me dê o valor do 2º lado do triângulo: ");
		
		int b = entrada.nextInt();
		
		System.out.println("Me dê o valor do 3º lado do triângulo: ");
		
		int c = entrada.nextInt();
		
		if ((a < b+c) && (b < a+c) && (c < a+b)){
			
		}else{
			
			System.out.println("Esse tirângulo não é real");
			
			entrada.close();
			
			System.exit(0);
			}
			
		 if (a == b && a == c && c==b) {
				System.out.println("Esse triângulo é real e possui três lados iguais. Portanto é um triângulo Equilátero");
				
			}else if(a == b || a == c || b == c) {
				
				System.out.println("Esse triângulo é real e possui dois lados iguais. Por isso é um triangulo Isósceles");
				
			}else if(a!=b && a!=c && b!=c){
				System.out.println("Esse triângulo é real e tem três lados diferentes. Por esse motivo é um triângulo Escaleno");		
		}
	}
}

