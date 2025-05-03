package SistemaGestaoVeiculosEServicosManutencao;

class Caminhao extends Veiculo{
	private double capacidadeCarga;

	
	
	Caminhao() {
		super();
	
	}

	Caminhao(String placa, String marca, String modelo, int ano, double kmRodados,double capacidadeCarga) {
		super(placa, marca, modelo, ano, kmRodados);
		this.capacidadeCarga = capacidadeCarga;
	
	}

	double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	
	@Override
	double calcularProximaManutencao() {
		return getKmRodados()+15000;
	}
	
	@Override
	void exibirInformacoes(){
		System.out.println("Caminhão");
		super.exibirInformacoes();
		System.out.println("Capacidade de Carga: " + getCapacidadeCarga());
	}
	
	@Override
	void exibirInformacoes(boolean detalhada) {
		if(!detalhada) {
			exibirInformacoes();
		}else {
			System.out.println("Caminhão");
			super.exibirInformacoes(detalhada);
		}
	}
}
