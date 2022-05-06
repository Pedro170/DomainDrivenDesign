package exercicio36;

public class Product {
	private int id;
	private String nome;
	private double preco;
	private double quantidade;
	private Category category;
	
	
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
	
	public void setNome( String nome ) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco( double preco ) {
		this.preco = preco;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	Product() {
		
	}
	
	Product(int id, String nome, double preco, double quantidade, Category category) {
		
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.category = category;
		
	}
	
	// metodos
	
	public String exibirNomeEpreco() {
		return "Nome: " + this.nome + "\n Preco: " + this.preco;
				
	}
	
	
	public String exibirNomeEquantidade() {
		return "Nome: " + this.nome + "\n Quantidade: " + this.quantidade;
	}
}
