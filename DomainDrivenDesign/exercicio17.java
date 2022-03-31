package DomainDrivenDesign;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		double peso, altura, imc;
		String name;
		
		System.out.print("Digite seu nome: ");
		name = leia.next();
		
		System.out.print("Escolha seu sexo biológico [F] = 1 ou [M] = 2 : ");
		int sexo = leia.nextInt();
		
		System.out.print("Digite seu peso: ");
		peso = leia.nextDouble();
		
		System.out.print("Digite sua altura: ");
		altura = leia.nextDouble();
		
		imc = peso / ( altura * altura );
		
		switch (sexo) {
		case 1:
			if (imc < 19)
			System.out.printf("Você está abaixo do peso. IMC = %.1f ", imc);
			
			else if (( imc <= 19) && ( imc < 24 ))
				System.out.printf("Você está no peso ideal. IMC = %.1f ", imc);
			
			else if ( imc >= 24 )
				System.out.printf("Você está acima do peso. IMC = %.1f ", imc);
			break;
			
		case 2:
			if (imc < 20)
				System.out.printf("Você está abaixo do peso. IMC = %.1f ", imc);
				
			else if (( imc <= 20) && ( imc < 25 ))
				System.out.printf("Você está no peso ideal. IMC = %.1f ", imc);
				
			else if ( imc >= 25 )
				System.out.printf("Você está acima do peso. IMC = %.1f ", imc);
			break;
		}
		
		System.out.println("\n\n========= I F O R M A Ç Õ E S =========");
		
		System.out.print("\nNome: " + name + "\nSexo: " + sexo + "\nPeso: " + peso + "kg" + "\nAltura: " + altura + "\nIMC: " + deci.format(imc));

	}

}
