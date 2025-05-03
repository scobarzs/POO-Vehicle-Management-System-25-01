package ex5;

class Pagamento {
	private double valor;
	private String descricao;
	
	Pagamento(){
		
	}
	
	Pagamento(double valor,String descricao){
		this.valor = valor;
		this.descricao = descricao;
	}

	double getValor() {
		return valor;
	}

	void setValor(double valor) {
		this.valor = valor;
	}

	String getDescricao() {
		return descricao;
	}

	void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	void processarPagamento() {
		System.out.println("Para: " + getDescricao());
		System.out.println("Valor: R$" + getValor());
	}
	
	void processarPagamento(double taxa) {
		double valorfinal = getValor()+taxa;
		System.out.println("Para: " + getDescricao());
		System.out.println("Valor: R$" + valorfinal);
		System.out.println("Taxa: R$" + taxa);
	}
	
}
