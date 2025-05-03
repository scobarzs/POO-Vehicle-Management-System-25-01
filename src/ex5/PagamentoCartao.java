package ex5;

class PagamentoCartao extends Pagamento{
	private String numeroCartao;
	
	PagamentoCartao() {
		super();
	}
	
	PagamentoCartao(double valor,String descricao,String numeroCartao) {
		super(valor,descricao);
		this.numeroCartao = numeroCartao;
	}
	
	String getNumeroCartao() {
		return numeroCartao;
	}

	void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	@Override
	void processarPagamento() {
		super.processarPagamento();
		System.out.println("Número do Cartão: " + getNumeroCartao());
	}
	
	@Override
	void processarPagamento(double taxa) {
		super.processarPagamento(taxa);
		System.out.println("Número do Cartão: " + getNumeroCartao());
	}
}
