package exercicio34;

import java.util.Scanner;

public class exercicio34 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	       
        // Cria um array contendo 10 posições para armazenar objetos
        Client[] listaClientes = new Client[5];
       
        int id;
        String nome;
        int idade;
        String email;
        char resposta;
        String agencia;
        String numero;
        double saldo;
       
        for (int i = 0; i <= 4; i++) {
   
            Client cliente;
           
            System.out.print("Digite o id: ");
            id = leia.nextInt();
           
            System.out.printf("Digite o nome: ");
            nome = leia.next();
            
            System.out.print("Digite a idade: ");
            idade = leia.nextInt();
            
            System.out.print("Digite o email: ");
            email = leia.next();
           
            System.out.print("Possui conta corrente? (S/N)");
            resposta = leia.next().charAt(0);
           
            if (resposta == 'S') {
            	
            	BankAccount conta;
            	
                System.out.print("Digite a agencia:  ");
                agencia = leia.next();
               
                System.out.print("Digite o numero da conta: ");
                numero = leia.next();
                
                System.out.print("Digite o saldo da conta: ");
                saldo = leia.nextDouble();
              
                conta = new BankAccount(agencia, numero, saldo);
                cliente = new Client(id, nome, idade, email, conta);
                
            }
            else {
            	
                cliente = new Client(id, nome, idade, email, null);            
            }
           
            listaClientes[i] = cliente;            
        }
               
        for (int i = 0; i <= 4; i++) {
        	
            System.out.printf("\nCliente criado com sucesso", listaClientes[i].id, listaClientes[i].nome);
                   
            if (listaClientes[i].conta != null) {
                System.out.printf("\n Conta: ", listaClientes[i].conta);
            }
        }
	}

}
