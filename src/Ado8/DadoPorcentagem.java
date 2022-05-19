package Ado8;

import java.util.Random;

public class DadoPorcentagem {

	public static void main(String[] args) {
		
		int jogadas=0;
		float num1 =0, num2=0, num3=0, num4=0, num5=0, num6=0;
		float porce1=0, porce2=0, porce3=0, porce4=0, porce5=0, porce6=0, porceTotal=0;
		
		do {
			
			Random dado = new Random();
			int numDado = dado.nextInt(6)+1;
			
			System.out.println(numDado);
			
			if(numDado == 1) {
				num1 = num1+1;
			}else if(numDado ==2){
				num2 = num2+1;
			}else if(numDado ==3){
				num3 = num3+1;
			}else if(numDado ==4){
				num4 = num4+1;
			}else if(numDado ==5){
				num5 = num5+1;
			}else if(numDado ==6){
				num6 = num6+1;
			}
			
			jogadas++;
			
		}while(jogadas<1000000);
		System.out.println("===========================================================");
		System.out.println("\n*--Número de vezes que cada número caiu--*\n");
		
		System.out.printf("Número 1: %.0f vezes\n", num1);
		System.out.printf("Número 2: %.0f vezes\n", num2);
		System.out.printf("Número 3: %.0f vezes\n", num3);
		System.out.printf("Número 4: %.0f vezes\n", num4);
		System.out.printf("Número 5: %.0f vezes\n", num5);
		System.out.printf("Número 6: %.0f vezes\n", num6);
		
		System.out.println("\nTotal de vezes: " + jogadas);
		
		porce1= (num1/jogadas)*100;
		porce2= (num2/jogadas)*100;
		porce3= (num3/jogadas)*100;
		porce4= (num4/jogadas)*100;
		porce5= (num5/jogadas)*100;
		porce6= (num6/jogadas)*100;
		
		porceTotal = porce1+porce2+porce3+porce4+porce5+porce6;
		
		System.out.println("\n*--Porcentagem de vezes que cada número caiu--*\n");
		
		System.out.println("Número 1: " + porce1 + " %");
		System.out.println("Número 2: " + porce2 + " %");
		System.out.println("Número 3: " + porce3 + " %");
		System.out.println("Número 4: " + porce4 + " %");
		System.out.println("Número 5: " + porce5 + " %");
		System.out.println("Número 6: " + porce6 + " %");
		
		System.out.println("\nPorcentagem total\n");
		
		System.out.println(porceTotal + " %");
		System.out.println("===========================================================");
		
		
		
	}

}
