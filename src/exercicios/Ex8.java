package exercicios;

public class Ex8 {

	public static void main(String[] args) {
		
		int i=13, quant=0,soma=0;
		int media=0;
		
		while(i<=73) {
			if(i%2==0) {
				soma+=i;
				quant++;
			}
			i++;
		}
		media=soma/quant;
		System.out.println("média dos pares entre 13 e 73: " + media);
	}

}
