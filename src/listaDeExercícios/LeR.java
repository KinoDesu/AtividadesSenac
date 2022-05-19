package listaDeExercícios;

import java.util.Scanner;

public class LeR {

	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
	double lado,raio,areaQuad,areaCirc,quadRaio,pi = Math.PI;
	
	System.out.println("Me dê o valor do lado de um quadrado: ");
	lado = entrada.nextDouble();
	
	System.out.println("Me dê o valor do raio de um círculo: ");
	raio = entrada.nextDouble();
	
	areaQuad = Math.pow(lado, 2);
	
	quadRaio = Math.pow(raio, 2);
	
	areaCirc = pi*quadRaio;
	
	if(areaQuad > areaCirc) {
		System.out.println("A maior área é a do quadrado com " + areaQuad + " cm²");
	}else if (areaQuad == areaCirc) {
		System.out.println("A área do quadrado e do círculo são iguais com " + areaQuad + " cm² para o quadrado e " + areaCirc + " cm² para o círculo");
	}else {
		System.out.println("A maior área é a do círculo com " + areaCirc + " cm²");
	}
	

	}

}
