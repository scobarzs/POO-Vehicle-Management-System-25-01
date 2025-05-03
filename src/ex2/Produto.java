package ex2;

public class Produto {
	private String name;
	private double preco;
	private String descricao;
	private int estoque;
	
	protected Produto() {
		
	}
	
	protected Produto(String name,double preco,String descricao,int estoque) {
		this.name = name;
		this.preco = preco;
		this.descricao = descricao;
		this.estoque = estoque;
	}
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected double getPreco() {
		return preco;
	}
	protected void setPreco(double preco) {
		this.preco = preco;
	}
	protected String getDescricao() {
		return descricao;
	}
	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	protected int getEstoque() {
		return estoque;
	}
	protected void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	protected double calcularPrecoFinal() {
		return getPreco();
	}
	
	protected void exibirDetalhes() {
		System.out.println("Nome: " + getName());
		System.out.println("Preco: " + getPreco());
		System.out.println(getDescricao());
	}
	
	protected void exibirDetalhes(boolean comEstoque) {
		System.out.println("Nome: " + getName());
		System.out.println("Preco: " + getPreco());
		System.out.println("Estoque: " + getEstoque());
		System.out.println(getDescricao());
	}
}
