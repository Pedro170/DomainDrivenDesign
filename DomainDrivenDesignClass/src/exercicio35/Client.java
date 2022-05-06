package exercicio35;

public class Client {
	private int id;
	private String nome;
	private int idade;
	private String email;
	private Account account;
	
	// getters e setters
	
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
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	// constructors
	
	Client(int id, String nome, int idade, String email, Account account) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.account = account;
	
	}
	
	Client() {
		
	}
	
	// metodos
	
	public void atualizarEmail(String email) {
		this.email = email;
	}
	
	public String exibirNomeEidade(String nome, int idade) {
		return "Nome: %s \n Idade: %d";
	}
	
	public String exibirDadosConta(String agencia, String numero, double saldo) {
		return "Agencia: %s \n Conta: %s \n Saldo: R$ %d";
	}
}
