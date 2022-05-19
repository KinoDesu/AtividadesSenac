package listaDeExercícios;

import java.util.Scanner;

public class TresNumeros {
	
	public static void main (String[] args){

	Scanner entrada = new Scanner(System.in);
	
	double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado,areaRetangulo, periRetangulo;
	double pi = Math.PI;
	
		System.out.println("valor de A");
		a = entrada.nextDouble();
		
		System.out.println("valor de B");
		b = entrada.nextDouble();
		
		System.out.println("valor de C");
		c = entrada.nextDouble();
		
		areaTriangulo = (a*c)/2;
		
		System.out.println("a) área do triângulo é " + areaTriangulo);
		
		areaCirculo = pi*(c*c);
		
		System.out.println("\nb) área do círculo é " + areaCirculo);
		
		areaTrapezio = (a + b)*c/2;
		
		System.out.println("\nc) área do trapézio é " + areaTrapezio);
		
		areaQuadrado = b*b;
		
		System.out.println("\nd) área do quadrado é " + areaQuadrado);
		
		areaRetangulo = a*b;
		
		System.out.println("\ne) área do retângulo é " + areaRetangulo);
		
		periRetangulo = 2*(a+b);
		
		System.out.println("\nf) perímetro do retângulo é " + periRetangulo);
		
	}
	
}
