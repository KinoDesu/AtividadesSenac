package exercicios;

public class Ex10 {

	public static void main(String[] args) {
		
		float soma=0, somaTotal=0;
		float i=1;
		
		while(i<=20) {
			soma=1/i;
			somaTotal=soma+somaTotal;
			i++;
			
		}
		System.out.println("total: " + somaTotal);
	}
}
