package DomainDrivenDesign;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double base, altura;
		
		System.out.print("Digite a base do ret�ngulo: ");
		base = leia.nextDouble();
		
		System.out.print("Digite a altura do ret�ngulo: ");
		altura = leia.nextDouble();
		
		System.out.printf("A �rea do ret�ngulo �: %.2f", (base * altura));
	}

}
