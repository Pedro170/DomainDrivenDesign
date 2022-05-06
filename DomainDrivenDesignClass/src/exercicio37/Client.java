package exercicio37;

public class Client {
	private int id;
	private String nome;
	private int idade;
	private String email;
	private BankAccount account;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
 	
	public BankAccount getAccount() {
		return account;
	}
	
	public void setConta(BankAccount account) {
		this.account = account;
	}
	
	Client() {
	
	}
	
	Client(int id, String nome, int idade, String email, BankAccount account) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.account = account;
	}
	
	// metodos
	
	public String getAccountEagencia() {
		return "Ag: " + this.account.getAgencia() + "\nConta: " + this.account.getNumero();
	}
}
