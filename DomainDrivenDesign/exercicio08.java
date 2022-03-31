package DomainDrivenDesign;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.print("Digite o primeiro número: ");
		num1 = leia.nextDouble();
		
		System.out.print("Digite o seugundo número: ");
		num2 = leia.nextDouble();
		
		if(num1 > num2)
			System.out.print("O número " + num1 + " é maior que número " + num2);
		else
			System.out.print("O número " + num2 + " é maior que número " + num1);
		
	}

}
