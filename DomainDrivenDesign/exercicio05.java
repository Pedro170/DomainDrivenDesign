package DomainDrivenDesign;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double temperatura;
		
		System.out.print("Digite a temperatura em graus Celsius: ");
		temperatura = leia.nextDouble();
		
		System.out.print("A temperatura é " + (temperatura * 1.8 + 32) + "°F");
	}
	
}
