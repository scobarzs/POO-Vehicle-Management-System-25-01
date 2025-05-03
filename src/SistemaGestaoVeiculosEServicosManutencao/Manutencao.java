package SistemaGestaoVeiculosEServicosManutencao;

class Manutencao {
	private String data;
	private String descricao;
	private double kmRealizada;
	
	Manutencao(String data, String descricao, double kmRealizada) {
		this.data = data;
		this.descricao = descricao;
		this.kmRealizada = kmRealizada;
	}
	
	Manutencao(){
		
	}
	
	String getData() {
		return data;
	}

	void setData(String data) {
		this.data = data;
	}

	String getDescricao() {
		return descricao;
	}

	void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	double getKmRealizada() {
		return kmRealizada;
	}

	void setKmRealizada(double kmRealizada) {
		this.kmRealizada = kmRealizada;
	}

	void exibirDetalhes() {
		System.out.println("Data: " + getData());
		System.out.println("Descricao: " + getDescricao());
		System.out.println("Quilometragem: " + getKmRealizada() + "km");
	}
	
	
	
	
}
