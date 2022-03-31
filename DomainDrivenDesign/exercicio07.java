package DomainDrivenDesign;

import java.util.Scanner;

public class exercicio07 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double prod1, prod2, prod3, prod4, prod5, dinheiro, totProd;
		
		System.out.println("==========================================");
		System.out.println(" Só aceitamos pagamento em dinheiro ");
		System.out.println("==========================================");
		
		System.out.print("Digite o valor do primeiro produto em: R$ ");
		prod1 = leia.nextDouble();
		
		System.out.print("Digite o valor do segundo produto em: R$ ");
		prod2 = leia.nextDouble();
		
		System.out.print("Digite o valor do terceiro produto em: R$ ");
		prod3 = leia.nextDouble();
		
		System.out.print("Digite o valor do quarto produto em: R$ ");
		prod4 = leia.nextDouble();
		
		System.out.print("Digite o valor do quinto produto em: R$ ");
		prod5 = leia.nextDouble();
		
		totProd = prod1 + prod2 + prod3 + prod4 + prod5;
		System.out.print("O total da sua compra foi de R$ " + totProd);
		
		System.out.print(" reais. Digite o valor do pagamento em dinheiro: R$ ");
		dinheiro = leia.nextDouble();
		
		
		System.out.printf("O seu troco é de: R$ %.2f", (dinheiro - totProd));
		
	}
	
}
