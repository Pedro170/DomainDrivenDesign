package DomainDrivenDesign;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double aresta;
		
		System.out.print("Digite a aresta do quadrado: ");
		aresta = leia.nextDouble();
		
		System.out.printf("A área do quadrado é de: %.2f", aresta * aresta);

	}

}
