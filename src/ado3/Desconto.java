package ado3;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Double porce1 = 20.00/100.00;
		
		Double porce2 = 15.00/100.00;
		
		System.out.println("Bem vindo á nossa loja! ^^");
		
		System.out.println("Nos dê o valor do produto: ");
		
		Double valor = entrada.nextDouble();
		
		if(valor >= 300) {
			
			Double valorFinal = valor - (porce1 * valor);
			
			Double desc = (porce1 * valor);
			
			System.out.println("seu produto está com uma promoção de 20% e ficou por: R$" + valorFinal + ". Você economizou R$" + desc + "!");
			
		}else {
			
			if (valor < 300) {
					
				Double valorFinal = valor - (porce2 * valor);
				
				Double desc = (porce2 * valor);
				
				System.out.println("seu produto está com uma promoção de 15% e ficou por: R$" + valorFinal + ". Você economizou R$" + desc + "!");
				
				entrada.close();
			
			}
		}
		
		

	}

}
