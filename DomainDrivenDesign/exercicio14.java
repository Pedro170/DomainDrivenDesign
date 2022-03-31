package DomainDrivenDesign;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double peso, altura, imc;
		
		System.out.print("Digite seu peso: ");
		peso = leia.nextDouble();
		
		System.out.print("Digite sua altura: ");
		altura = leia.nextDouble();
		
		imc = peso / ( altura * altura );
		
		if (imc < 18.5)
			System.out.printf("Você está abaixo do peso. IMC = %.1f", imc);
		
		else if (( imc >= 18.5) && ( imc <= 24.9 ))
			System.out.printf("Você está no peso normal. IMC = %.1f", imc);
		
		else if (( imc >= 25 ) && ( imc <= 29.9 ))
			System.out.printf("Você está com sobrepeso. IMC = %.1f", imc);
		
		else if (( imc >= 30 ) && ( imc <= 34.9 ))
			System.out.printf("Você está com Obesidade Grau I. IMC = %.1f", imc);
		
		else if (( imc >= 35) && ( imc <= 39.9 ))
			System.out.printf("Você está com Obesidade Grau II. IMC = %.1f", imc);
		
		else
			System.out.printf("Você está com Obesidade Grau III ou Mórbida. IMC = %.1f", imc);
	}

}
