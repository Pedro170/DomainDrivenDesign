package exercicio35;

import java.util.Scanner;

public class exercicio35 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Client[] listaCliente = new Client[5];
		
		int id;
		String nome;
		int idade;
		String email;
		char resposta;
		String agencia;
		String numero;
		double saldo;
		Account conta;

		
		for (int i = 0; i <= 4; i++) {
		
			Client cliente = new Client();
			
			System.out.printf("Digite o id: ");
			id = leia.nextInt();
			cliente.setId(id);
			
			System.out.printf("Digite o nome: ");
			nome = leia.nextLine();
			cliente.setNome(nome);
			
			System.out.printf("Digite a idade: ");
			idade = leia.nextInt();
			cliente.setIdade(idade);
			
			System.out.print("Digite o email: ");
			email = leia.nextLine();
			cliente.setEmail(email);
			
			System.out.print("Tem conta bancária? S/N");
			resposta = leia.nextLine().charAt(0);
			
			if (resposta == 'S' || resposta == 's') {
				
				conta = new Account();
				
				System.out.print("Digite a agencia: ");
				agencia = leia.nextLine();
				conta.setAgencia(agencia);
				
				System.out.print("Digite o numero: ");
				numero = leia.nextLine();
				conta.setNumero(numero);
				
				System.out.print("Digite o saldo: ");
				saldo = leia.nextDouble();
				conta.setSaldo(saldo);
				
				
			} else {
				
				conta = null;
				
			}
			
			
			cliente = new Client(id, nome, idade, email, conta);
			
			listaCliente[i] = cliente;
			
		}
		
		// exibir clientes
		
		for (int i = 0; i <= 4; i++) {
			
			
			System.out.printf("\n Dados do cliente %d \n Nome: %s \n Idade: %d \n Saldo: %s", listaCliente[i].getId(), listaCliente[i].getNome(), listaCliente[i].getIdade(), listaCliente[i].getAccount().getSaldo());
			
		}
	}

}
