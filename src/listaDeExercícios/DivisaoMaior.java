package listaDeExerc�cios;

import java.util.Scanner;

public class DivisaoMaior {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float n1, n2, result;
		
		System.out.println("N1: ");
		n1 = entrada.nextFloat();
		
		System.out.println("N2: ");
		n2 = entrada.nextFloat();
		
		if (n1>n2 && n2>0) {
			result = n1/n2;
			
			System.out.println(n1 + " dividido por " + n2 + " � igual a " + result);
				
		}else if (n2>n1 && n1>0) {
			result = n2/n1;
			
			System.out.println(n2 + " dividido por " + n1 + " � igual a " + result);
		}else {
			System.out.println("Opera��o imposs�vel. N�o existe n�mero divis�vel por 0 (zero)");
		}

	}

}
