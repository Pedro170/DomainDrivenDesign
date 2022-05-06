package exercicio33;

import java.util.Scanner;

public class exercico33 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Produto [] listaProduto = new Produto[10];
		
		for (int i = 0; i < 10; i++) {
			
			Produto prod = new Produto();
			
			System.out.print("Digite o id do produto: ");
			prod.id = leia.nextInt();
			
			System.out.print("Digite a descrição do produto: ");
			prod.descricao = leia.next();
			
			System.out.print("Digite o valor do produto: ");
			prod.valor = leia.nextDouble();
			
			System.out.print("Digite a quantidade: ");
			prod.quantidade = leia.nextDouble();
			
			listaProduto[i] = prod;
			
			
		}
		
		for (int i = 0; i <= 9; i++) {
			
			if (listaProduto[i].valor >= 100) {
				
				System.out.print(listaProduto[i].descricao);
			
			}
			
		}
	}

}
