package DomainDrivenDesign;

import java.util.Scanner;

public class exercicio03 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double base, altura;
		int idade = 23;
		String name = "Pedro";
		
		System.out.print("Digite a base do triângulo: ");
		base = leia.nextDouble();
		
		System.out.print("Digite a altura do triângulo: ");
		altura = leia.nextDouble();
		
		System.out.printf("A área do retângulo é: %.2f", (base * altura) / 2);
		
	}
	
}
