package listaDeExerc�cios;

import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float num = 0;
		
		System.out.println("Nos d� um n�mero:");
		num = entrada.nextFloat();
		
		if (num < 0) {
			System.out.println("N�mero negativo");
		}else if (num == 0){
			System.out.println("N�mero Neutro");
		}else {
			System.out.println("N�mero Positivo");
		}
		
	}

}
