package ex3;

public class Quarto {
	private int numeroQuarto;
	private double precoPorNoite;
	private String tipo;
	
	Quarto() {
		
	}
	Quarto(int numeroQuarto,double precoPorNoite,String tipo) {
		this.numeroQuarto = numeroQuarto;
		this.precoPorNoite = precoPorNoite;
		this.tipo = tipo;
	}
	int getNumeroQuarto() {
		return numeroQuarto;
	}
	void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	double getPrecoPorNoite() {
		return precoPorNoite;
	}
	void setPrecoPorNoite(double precoPorNoite) {
		this.precoPorNoite = precoPorNoite;
	}
	String getTipo() {
		return tipo;
	}
	void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	double calcularDiaria(int noites){
		double precoTotal = noites*getPrecoPorNoite();
		return precoTotal;
	}
	
	void exibirInformacoes() {
		System.out.println("Número do Quarto: " + getNumeroQuarto());
		System.out.println("Tipo do Quarto: " + getTipo());
	}
	
	void exibirInformacoes(boolean comPreco) {
		System.out.println("Número do Quarto: " + getNumeroQuarto());
		System.out.println("Tipo do Quarto: " + getTipo());
		if(comPreco == true) {
			System.out.println("Per Noite: " + getPrecoPorNoite());
		}
	}
	
}
