package exercicio34;

public class Client {
	public int id;
	public String nome;
	public int idade;
	public String email;
	BankAccount conta;
	
	Client(int id, String nome, int idade, String email, BankAccount conta) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
		
	}
	
	Client() {
		
	}
	
	public void atualizarEmail() {
		
	}
}
