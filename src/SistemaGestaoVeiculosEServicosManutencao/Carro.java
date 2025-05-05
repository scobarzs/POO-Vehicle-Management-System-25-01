package SistemaGestaoVeiculosEServicosManutencao;

class Carro extends Veiculo{
	private int quantidadePortas;

	Carro() {
		super();
	}

	Carro(String placa, String marca, String modelo, int ano, double kmRodados,int quantidadePortas) {
		super(placa, marca, modelo, ano, kmRodados);
		this.quantidadePortas = quantidadePortas;
	}

	int getQuantidadePortas() {
		return quantidadePortas;
	}

	void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	@Override
	double calcularProximaManutencao() {
		return getKmRodados() + 10000;
	}
	
	@Override
	void exibirInformacoes() {
		System.out.println("Carro");
		super.exibirInformacoes();
		System.out.println("Quantidade de Portas: " + getQuantidadePortas());
	}
	
	@Override
	void exibirInformacoes(boolean detalhada) {
		if(!detalhada) {
			exibirInformacoes();
		}else {
			System.out.println("Carro");
			super.exibirInformacoes(detalhada);
			System.out.println("Quantidade de Portas: " + getQuantidadePortas());
		}
	}
	
}
