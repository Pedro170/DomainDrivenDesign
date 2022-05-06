package exercicio36;

import java.util.Scanner;

public class exercicio36 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Product[] listProduct = new Product[5];
		
		int id;
		String nome;
		double preco;
		double quantidade;
		int idCategory;
		String nomeCategory;
		char resposta;
		
		Category category;
		
		
		for (int i = 0; i <= 4; i++) {
			
			Product product = new Product();
			
			System.out.print("Digite o id: ");
			id = leia.nextInt();
			product.setId(id);
			
			System.out.print("Digite o nome: ");
			nome = leia.nextLine();
			product.setNome(nome);
			
			System.out.print("Digite o preco: ");
			preco = leia.nextDouble();
			product.setPreco(preco);
			
			System.out.print("Digite a quantidade: ");
			quantidade = leia.nextDouble();
			product.setQuantidade(quantidade);
			
			System.out.print("O produto tem categoria? S/N ");
			resposta = leia.next().charAt(0);
			
			if (resposta == 's' || resposta == 'S') {
				
				category = new Category();
				
				System.out.print("Digite o id da categoria: ");
				idCategory = leia.nextInt();
				category.setId(idCategory);
				
				
				System.out.print("Digite o nome da categoria: ");
				nomeCategory = leia.nextLine();
				category.setNome(nomeCategory);
				
				
				
			} else {
				category = null;
			}
			

			product = new Product(id, nome, preco, quantidade, category);
			listProduct[i] = product;
			
		}
		
        for (int i = 0; i <= 4; i++) {
            System.out.printf("\nProduto %d criado com sucesso (%s)!", listProduct[i].getId(), listProduct[i].getNome());
        }
	}

}
