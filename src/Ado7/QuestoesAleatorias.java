package Ado7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestoesAleatorias {

	public static void main(String[] args) {
		
		int tentativas = 1;
		String resposta = "z";
		boolean acerto = false;

		Scanner entrada = new Scanner (System.in);
		
		ArrayList<String>alternativas = new ArrayList<String>();
		alternativas.add("a necessidade que as organiza��es sentiram de ordem e de exatid�o e das reivindica��es dos trabalhadores por um tratamento justo e imparcial.");
		alternativas.add("a preocupa��o psicol�gica e sociol�gica quanto � influ�ncia massificante da civiliza��o industrial sobre o ser humano.");
		alternativas.add("a �nfase na estrutura que a organiza��o deveria possuir para ser eficiente.");
		alternativas.add("a �nfase nas pessoas que trabalham ou que participam nas organiza��es.");
		alternativas.add("o enfoque nos resultados e objetivos alcan�ados (fins) por meio do controle de todos os aspectos de produ��o.");
		
		String correto = "a �nfase na estrutura que a organiza��o deveria possuir para ser eficiente.";
		
		do {
			
			Collections.shuffle(alternativas);
			
			System.out.println("Tentativa" + tentativas + "/3");
			
			System.out.println("\nQuest�o:\nEnquanto a Administra��o Cient�fica se caracterizava pela �nfase na realizada pelo oper�rio/colaborador, a Teoria Cl�ssica tinha por caracter�stica:\n");
			
			System.out.println("a)" + alternativas.get(0));
			System.out.println("b)" + alternativas.get(1));
			System.out.println("c)" + alternativas.get(2));
			System.out.println("d)" + alternativas.get(3));
			System.out.println("e)" + alternativas.get(4));
			
			resposta = entrada.next();
			
			switch(resposta) {
			case "a":
			case "A":
				if (alternativas.get(0).equals(correto)) {
					
					System.out.println("Resposta Correta!");
					
					acerto = true;
					
				}else {
					
					System.out.println("Resposta errada");
					
					tentativas = tentativas+1;
					
					System.out.println("------------------------------------\n");
					
					if(tentativas>=4) {
						System.out.println("Sua tentativas acabaram.");
					}
					
				}
				
				break;
				
			case "b":
			case "B":
				if (alternativas.get(1).equals(correto)) {
					
					System.out.println("Resposta Correta!");
					
					acerto = true;
					
				}else {
					
					System.out.println("Resposta errada");
					
					tentativas = tentativas+1;
					
					System.out.println("------------------------------------\n");
					
					if(tentativas>=4) {
						System.out.println("Sua tentativas acabaram.");
					}
				}
				
				break;
				
			case "c":
			case "C":
				if (alternativas.get(2).equals(correto)) {
					
					System.out.println("Resposta Correta!");
					
					acerto = true;
					
				}else {
					
					System.out.println("Resposta errada");
					
					tentativas = tentativas+1;
					
					System.out.println("------------------------------------\n");
					
					if(tentativas>=4) {
						System.out.println("Sua tentativas acabaram.");
					}
				}
				
				break;
				
			case "d":
			case "D":
				if (alternativas.get(3).equals(correto)) {
					
					System.out.println("Resposta Correta!");
					
					acerto = true;
					
				}else {
					
					System.out.println("Resposta errada");
					
					tentativas = tentativas+1;
					
					System.out.println("------------------------------------\n");
					
					if(tentativas>=4) {
						System.out.println("Sua tentativas acabaram.");
					}
				}
				
				break;
				
			case "e":
			case "E":
				if (alternativas.get(4).equals(correto)) {
					
					System.out.println("Resposta Correta!");
					
					acerto = true;
					
				}else {
					
					System.out.println("Resposta errada");
					
					tentativas = tentativas+1;
					System.out.println("------------------------------------\n");
					
					if(tentativas>=4) {
						System.out.println("Sua tentativas acabaram.");
					}
				}
				
				break;
				
			default:
					
					System.out.println("Alternativa Inv�lida");
					System.out.println("------------------------------------\n");
					break;
			
			}
			
		}while(!(tentativas>=4 || acerto == true));
		
	}

}
