package ex3;

public class QuartoSimples extends Quarto{
	private int ocupacaoMaxima;
	
	QuartoSimples(int numeroQuarto,double precoPorNoite,String tipo,int ocupacaoMaxima){
		super(numeroQuarto,precoPorNoite,tipo);
		this.ocupacaoMaxima = ocupacaoMaxima;
	}
	int getOcupacaoMaxima() {
		return ocupacaoMaxima;
	}
	void setOcupacaoMaxima(int max) {
		ocupacaoMaxima = max;
	}
	
	@Override
	void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Ocupação Máxima: " + getOcupacaoMaxima());
	}
	
	@Override
	void exibirInformacoes(boolean comPreco) {
		super.exibirInformacoes(comPreco);
		System.out.println("Ocupação Máxima: " + getOcupacaoMaxima());
	}
}
