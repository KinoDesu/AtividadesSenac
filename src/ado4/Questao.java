package ado4;

import java.util.Scanner;

public class Questao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Questão: \n\nEnquanto a Administração Científica se caracterizava pela ênfase na tarefa \nrealizada pelo operário/colaborador, a Teoria Clássica tinha por característica");
		
		System.out.println("\n\n A) a necessidade que as organizações sentiram de ordem e de exatidão e das \n    reivindicações dos trabalhadores por um tratamento justo e imparcial.");
		
		System.out.println("\n B) a preocupação psicológica e sociológica quanto à influência \n    massificante da civilização industrial sobre o ser humano.");
		
		System.out.println("\n C) a ênfase na estrutura que a organização deveria possuir para ser eficiente.");
		
		System.out.println("\n D) a ênfase nas pessoas que trabalham ou que participam nas organizações.");
		
		System.out.println("\n E) o enfoque nos resultados e objetivos alcançados (fins) \n    por meio do controle de todos os aspectos de produção.");
		
		String resposta = entrada.next();
		
		switch(resposta) {
		
		case "a" :
		case "A" :
		case "b" :
		case "B" :
		case "d" :
		case "D" :
		case "e" :
		case "E" :
			System.out.println("Resposta errada. Resposta correta é a C");
			
			break;
			
		case "c" :
		case "C" :
			System.out.println("Resposta correta!!");
			
			break;
			
		}

	}

}
