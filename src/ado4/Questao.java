package ado4;

import java.util.Scanner;

public class Questao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Quest�o: \n\nEnquanto a Administra��o Cient�fica se caracterizava pela �nfase na tarefa \nrealizada pelo oper�rio/colaborador, a Teoria Cl�ssica tinha por caracter�stica");
		
		System.out.println("\n\n A) a necessidade que as organiza��es sentiram de ordem e de exatid�o e das \n    reivindica��es dos trabalhadores por um tratamento justo e imparcial.");
		
		System.out.println("\n B) a preocupa��o psicol�gica e sociol�gica quanto � influ�ncia \n    massificante da civiliza��o industrial sobre o ser humano.");
		
		System.out.println("\n C) a �nfase na estrutura que a organiza��o deveria possuir para ser eficiente.");
		
		System.out.println("\n D) a �nfase nas pessoas que trabalham ou que participam nas organiza��es.");
		
		System.out.println("\n E) o enfoque nos resultados e objetivos alcan�ados (fins) \n    por meio do controle de todos os aspectos de produ��o.");
		
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
			System.out.println("Resposta errada. Resposta correta � a C");
			
			break;
			
		case "c" :
		case "C" :
			System.out.println("Resposta correta!!");
			
			break;
			
		}

	}

}
