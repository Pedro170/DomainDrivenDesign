package exercicio32;

import java.util.Scanner;

public class exercicio32 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Pessoa [] listaPessoas = new Pessoa[5];
		
		for (int i = 0; i <= 4; i++) {
			
			Pessoa p = new Pessoa();
			
			System.out.print("Digite o id da pessoa: ");
			p.id = leia.nextInt();
			
			System.out.print("Digite o nome da pessoa: ");
			p.nome = leia.next();
			
			System.out.print("Digite a idade da pessoa: ");
			p.idade = leia.nextInt();
			
			System.out.print("Digite o email da pessoa:");
			p.email = leia.next();
			
			listaPessoas[i] = p;
		}
			
		
		for (int i = 0; i <=4; i++) {
					
			if (listaPessoas[i].idade >= 18) {
				
					System.out.print("\n As pessoas maiores de 18 anos são " + listaPessoas[i].nome);
					
				}
				
				
		}
	}

}
