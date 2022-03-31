package DomainDrivenDesign;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		String name;
		double p1, p2, media;
		
		System.out.print("Digite o nome do aluno: ");
		name = leia.next();

		System.out.print("Digite a P1: ");
		p1 = leia.nextDouble();
		
		System.out.print("Digite a P2: ");
		p2 = leia.nextDouble();
		
		media = ( p1 + (2 * p2) / 3 );
		
		System.out.println("======= Situação do Aluno =======");
		
		if(media >= 5) 
			System.out.print("Nome: " + name + "\nP1: " + p1 + "\nP2: " + p2 + "\nMédia: " + deci.format(media) +"\nSituação: Aprovado");
		
		else
			System.out.print("Nome: " + name + "\nP1: " + p1 + "\nP2: " + p2 + "\nMédia: " + deci.format(media) +"\nSituação: Reprovado");
		
	}

}
