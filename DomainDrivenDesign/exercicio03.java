package DomainDrivenDesign;

import java.util.Scanner;

public class exercicio03 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double base, altura;
		int idade = 23;
		String name = "Pedro";
		
		System.out.print("Digite a base do tri�ngulo: ");
		base = leia.nextDouble();
		
		System.out.print("Digite a altura do tri�ngulo: ");
		altura = leia.nextDouble();
		
		System.out.printf("A �rea do ret�ngulo �: %.2f", (base * altura) / 2);
		
	}
	
}
