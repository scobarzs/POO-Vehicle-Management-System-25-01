package SistemaGestaoVeiculosEServicosManutencao;

import java.util.ArrayList;

class Veiculo {
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private double kmRodados;
	private ArrayList<Manutencao> manutencoes;
	
	
	public Veiculo() {
	
	}
	public Veiculo(String placa,String marca,String modelo,int ano,double kmRodados) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.kmRodados = kmRodados;
		manutencoes = new ArrayList<Manutencao>();
	}
	
	
	String getPlaca() {
		return placa;
	}
	void setPlaca(String placa) {
		this.placa = placa;
	}
	
	String getMarca() {
		return marca;
	}
	void setMarca(String marca) {
		this.marca = marca;
	}
	
	String getModelo() {
		return modelo;
	}
	void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	int getAno() {
		return ano;
	}
	void setAno(int ano) {
		this.ano = ano;
	}
	
	double getKmRodados() {
		return kmRodados;
	}
	void setKmRodados(double kmRodados) {
		this.kmRodados = kmRodados;
	}
	
	ArrayList<Manutencao> getManutencoes() {
		return manutencoes;
	}
	void setManutencoes(ArrayList<Manutencao> manutencoes) {
		this.manutencoes = manutencoes;
	}
	
	void adicionarManutencao(Manutencao manutencao){
		getManutencoes().add(manutencao);
	}
	void exibirInformacoes() {
		System.out.println("Placa: " + getPlaca());
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ano: " + getAno());
		System.out.println("Quilometragem: " + getKmRodados() + "km");
	}
	
	void exibirInformacoes(boolean detalhada) {
		System.out.println("Placa: " + getPlaca());
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ano: " + getAno());
		System.out.println("Quilometragem: " + getKmRodados() + "km");
		System.out.println("----Última Manutenção----");
		if(ultimaManutencao().getData()==null) {
			System.out.println("  Sem Registro");
		}else {
			ultimaManutencao().exibirDetalhes();System.out.println("---------");
		}
		
	}
	
	double calcularProximaManutencao() {
		return getKmRodados();
	}
	
	//Calculates the last maintenance using the closest mileage to the actual
	Manutencao ultimaManutencao() {
		Manutencao manutencaoRetorno = new Manutencao();
		for(Manutencao manutencao:getManutencoes()) {
			if(manutencao.getKmRealizada()==getKmRodados()) {
				manutencaoRetorno = manutencao;
				return manutencaoRetorno;
			}else if(manutencao.getKmRealizada()<getKmRodados()) {
				continue;
			}
		}
		return manutencaoRetorno;
	}
}
