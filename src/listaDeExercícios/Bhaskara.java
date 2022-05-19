package listaDeExercícios;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double a, b, c, delta, x1,x2,raizDelta;
		
		System.out.println("A: ");
		a = entrada.nextDouble();
		
		System.out.println("B: ");
		b = entrada.nextDouble();
		
		System.out.println("C: ");
		c = entrada.nextDouble();
		
		delta = (b*b)+(-4*(a*c));
		
		if (a == 0) {
			System.out.println("Operação impossível.\nA = 0.\nNão existe número divisível por 0 (zero)");
		}else if (delta <0){
			System.out.println("Operação impossível. Delta é menor que 0 (zero)");
			System.out.println("Delta = " + delta);
		}else {
			System.out.println("delta = " + delta);
		raizDelta = Math.sqrt(delta);
		
		x1 = ((-(b))+raizDelta)/(2*a);
		x2 = ((-(b))-raizDelta)/(2*a);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
 
		
		}
	}

}
