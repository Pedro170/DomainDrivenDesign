package DomainDrivenDesign;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double base, altura;
		
		System.out.print("Digite a base do retângulo: ");
		base = leia.nextDouble();
		
		System.out.print("Digite a altura do retângulo: ");
		altura = leia.nextDouble();
		
		System.out.printf("A área do retângulo é: %.2f", (base * altura));
	}

}
