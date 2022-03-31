package DomainDrivenDesign;

import java.util.Scanner;

public class exercicio06 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double cotacao, dolar;
		
		System.out.print("Qual a cotação do dolar hoje: ");
		cotacao = leia.nextDouble();
		
		System.out.print("");
		dolar = leia.nextDouble();
		
		System.out.printf("Você terá em R$: %.1f", ( cotacao * dolar ));
	}
	
}
