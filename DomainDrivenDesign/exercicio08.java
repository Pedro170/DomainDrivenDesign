package DomainDrivenDesign;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = leia.nextDouble();
		
		System.out.print("Digite o seugundo n�mero: ");
		num2 = leia.nextDouble();
		
		if(num1 > num2)
			System.out.print("O n�mero " + num1 + " � maior que n�mero " + num2);
		else
			System.out.print("O n�mero " + num2 + " � maior que n�mero " + num1);
		
	}

}
