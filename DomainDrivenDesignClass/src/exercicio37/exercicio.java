package exercicio37;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Client> listClients = new ArrayList<>();
		
		int id;
		String nome;
		int idade;
		String email;
		String agencia;
		String numero;
		double saldo;
		char resposta;

		for (int i = 0; i <= 4; i ++) {
			
			
			Client client = new Client();
			
	        id = listClients.size() + 1;
	        client.setId(id);
			
			System.out.print("Digite o nome: ");
			nome = leia.nextLine();
			client.setNome(nome);
			
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			client.setIdade(idade);
			
			System.out.printf("Digite o email: ");
			email = leia.next();
			client.setEmail(email);
			
			System.out.print("Tem conta bancária? S/N");
			resposta = leia.nextLine().charAt(0);
			
			if (resposta == 'S' || resposta == 's') {
				
				BankAccount conta = new BankAccount();
				
				System.out.print("Digite a agencia: ");
				agencia = leia.nextLine();
				conta.setAgencia(agencia);
				
				System.out.print("Digite o numero: ");
				numero = leia.nextLine();
				conta.setNumero(numero);
				
				System.out.print("Digite o saldo: ");
				saldo = leia.nextDouble();
				conta.setSaldo(saldo);
				
				client = new Client(id, nome, idade, email, conta);
				
			} else {
				
				client = new Client(id, nome, idade, email, null);
				
			}
			
			listClients.add(client);
		}
		
			for (Client c: listClients) {
				
				if (c.getAccount() != null) {

					System.out.printf("ID %d - Nome: %s  \nDados bancarios: %s - %s", c.getId(), c.getNome(), c.getAccountEagencia());	

				} else {

					System.out.printf("ID %d - Nome: %s  \nNão possui conta bancária", c.getId(), c.getNome());	

					
				}

			}
	}

}
