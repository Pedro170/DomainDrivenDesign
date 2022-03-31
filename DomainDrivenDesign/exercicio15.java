package DomainDrivenDesign;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double l1, l2, l3;
		
		System.out.print("Digite o primeiro lado: ");
		l1 = leia.nextDouble();
		
		System.out.print("Digite o segundo lado: ");
		l2 = leia.nextDouble();
		
		System.out.print("Digite o terceiro lado: ");
		l3 = leia.nextDouble();

		if (( l1 + l2 > l3 ) && ( l1 + l3 > l2 ) && ( l2 + l3 > l1 ))
			System.out.print("Existe um triângulo.");
		
		if (( l1 == l2 ) && ( l1 == l3 ) && ( l2 == l3 ))
			System.out.print(" E ele é Equilátero");
			
		else if (( l1 != l2) && ( l1 != l3 ) && ( l2 != l3 ))
			System.out.print(" E ele é Escaleno");
	
		else 
			System.out.println(" E ele é Isósceles");
	}

}
