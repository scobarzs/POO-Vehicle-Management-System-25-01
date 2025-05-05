package ex3;

public class Suite extends Quarto{
	private String servicoExtra;
	
	Suite(int numeroQuarto,double precoPorNoite,String tipo,String servicoExtra){
		super(numeroQuarto,precoPorNoite,tipo);
		this.servicoExtra = servicoExtra;
	}
	
	String getServicoExtra() {
		return servicoExtra;
	}
	
	void setServicoExtra(String servicoExtra) {
		this.servicoExtra = servicoExtra;
	}
	@Override
	double calcularDiaria(int noites) {
		double taxaSuite = getPrecoPorNoite()*1.50;
		setPrecoPorNoite(taxaSuite*noites);
		return getPrecoPorNoite();
	}
	
	@Override
	void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Serviço Extra: " + getServicoExtra());
	}
	
	@Override
	void exibirInformacoes(boolean comPreco) {
		super.exibirInformacoes(comPreco);
		System.out.println("Serviço Extra: " + getServicoExtra());
	}
}
