package DomainDrivenDesign;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.print("Digite o primeiro número: ");
		num1 = leia.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		num2 = leia.nextDouble();
		
		System.out.print("Digite o terceiro número: ");
		num3 = leia.nextDouble();
		
		if(( num1 > num2 ) && ( num1 > num3 ))
			System.out.print("O [" + num1 + "] é maior quer " + num2 + " e " + num3);
		else if(( num2 > num1 ) && ( num2 > num3 ))
			System.out.print("O [" + num2 + "] é maior quer " + num1 + " e " + num3);
		else
			System.out.print("O [" + num3 + "] é maior quer " + num1 + " e " + num2);
	}
	
}
