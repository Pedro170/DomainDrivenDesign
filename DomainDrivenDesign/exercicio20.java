package DomainDrivenDesign;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		String name;
		double p1, p2, media;
		
		System.out.print("Digite o nome do aluno: ");
		name = leia.next();

		System.out.print("Digite a P1: ");
		p1 = leia.nextDouble();
		
		media = 5;
		
		p2 = (3 * media - p1) / 2;
		System.out.println("======= Situação do Aluno =======");
		
		System.out.print("Você precisará tirar " + deci.format(p2) + " na p2");
	}	
	
}
