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
		alternativas.add("a necessidade que as organizações sentiram de ordem e de exatidão e das reivindicações dos trabalhadores por um tratamento justo e imparcial.");
		alternativas.add("a preocupação psicológica e sociológica quanto à influência massificante da civilização industrial sobre o ser humano.");
		alternativas.add("a ênfase na estrutura que a organização deveria possuir para ser eficiente.");
		alternativas.add("a ênfase nas pessoas que trabalham ou que participam nas organizações.");
		alternativas.add("o enfoque nos resultados e objetivos alcançados (fins) por meio do controle de todos os aspectos de produção.");
		
		String correto = "a ênfase na estrutura que a organização deveria possuir para ser eficiente.";
		
		do {
			
			Collections.shuffle(alternativas);
			
			System.out.println("Tentativa" + tentativas + "/3");
			
			System.out.println("\nQuestão:\nEnquanto a Administração Científica se caracterizava pela ênfase na realizada pelo operário/colaborador, a Teoria Clássica tinha por característica:\n");
			
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
					
					System.out.println("Alternativa Inválida");
					System.out.println("------------------------------------\n");
					break;
			
			}
			
		}while(!(tentativas>=4 || acerto == true));
		
	}

}
