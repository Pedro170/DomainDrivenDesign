package DomainDrivenDesign;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.print("Digite a base do ret�ngulo: ");
		base = leia.nextDouble();
		
		System.out.print("Digite a altura do ret�ngulo: ");
		altura = leia.nextDouble();
		
		area = base * altura;
		
		if(area > 100)
			System.out.print("O terreno � grande, tem " + area + "m");
		else
			System.out.println("O terreno � pequeno, tem " + area + "m");
	}

}
