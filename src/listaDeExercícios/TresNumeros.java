package listaDeExerc�cios;

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
		
		System.out.println("a) �rea do tri�ngulo � " + areaTriangulo);
		
		areaCirculo = pi*(c*c);
		
		System.out.println("\nb) �rea do c�rculo � " + areaCirculo);
		
		areaTrapezio = (a + b)*c/2;
		
		System.out.println("\nc) �rea do trap�zio � " + areaTrapezio);
		
		areaQuadrado = b*b;
		
		System.out.println("\nd) �rea do quadrado � " + areaQuadrado);
		
		areaRetangulo = a*b;
		
		System.out.println("\ne) �rea do ret�ngulo � " + areaRetangulo);
		
		periRetangulo = 2*(a+b);
		
		System.out.println("\nf) per�metro do ret�ngulo � " + periRetangulo);
		
	}
	
}
