package Ados;

import java.util.Scanner;

public class ImparesAteX {

	public static void main(String[] args) {
		
		int x;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Me dê um valor final");
		x = entrada.nextInt();
		
		for(int i=1; i<=x;i++) {
			
			if(i%2==1) {
				System.out.println(i);
			}
			
		}

	}

}
