package DomainDrivenDesign;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double num1, num2, num3, num4, media;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = leia.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		num2 = leia.nextDouble();
		
		System.out.print("Digite o terceiro n�mero: ");
		num3 = leia.nextDouble();
		
		System.out.print("Digite o quarto n�mero: ");
		num4 = leia.nextDouble();
		
		media = ( num1 + num2 + num3 + num4 ) / 4;
		
		System.out.printf("A m�dia dos n�meros digitatos foi de:  %.1f", media);
		
	}

}
