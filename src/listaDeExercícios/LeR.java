package listaDeExerc�cios;

import java.util.Scanner;

public class LeR {

	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
	double lado,raio,areaQuad,areaCirc,quadRaio,pi = Math.PI;
	
	System.out.println("Me d� o valor do lado de um quadrado: ");
	lado = entrada.nextDouble();
	
	System.out.println("Me d� o valor do raio de um c�rculo: ");
	raio = entrada.nextDouble();
	
	areaQuad = Math.pow(lado, 2);
	
	quadRaio = Math.pow(raio, 2);
	
	areaCirc = pi*quadRaio;
	
	if(areaQuad > areaCirc) {
		System.out.println("A maior �rea � a do quadrado com " + areaQuad + " cm�");
	}else if (areaQuad == areaCirc) {
		System.out.println("A �rea do quadrado e do c�rculo s�o iguais com " + areaQuad + " cm� para o quadrado e " + areaCirc + " cm� para o c�rculo");
	}else {
		System.out.println("A maior �rea � a do c�rculo com " + areaCirc + " cm�");
	}
	

	}

}
