package DomainDrivenDesign;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double a, b, c, tr;
		
		System.out.print("Digite um valor para A: ");
		a = leia.nextDouble();
		
		System.out.print("Digite um valor para B: ");
		b = leia.nextDouble();

		System.out.print("Digite um valor para C: ");
		c = leia.nextDouble();
		
		if (( a + b > c ) && ( a + c > b ) && ( b + c > a ))
			
			
			System.out.print("Existe um triângulo.");
		
		
		
	}

}
