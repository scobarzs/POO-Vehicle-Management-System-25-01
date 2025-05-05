package ex5;

class PagamentoBoleto extends Pagamento{
	private String codigoBarras;

	PagamentoBoleto() {
		super();
	}

	PagamentoBoleto(double valor, String descricao,String codigoBarras) {
		super(valor, descricao);
		this.codigoBarras = codigoBarras;
	}

	String getCodigoBarras() {
		return codigoBarras;
	}

	void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	@Override
	void processarPagamento() {
		setValor(getValor()-5);
		super.processarPagamento();
		System.out.println("Taxa: R$5,00" );
	}
	
	@Override
	void processarPagamento(double desconto) {
		setValor(getValor()-desconto);
		super.processarPagamento();
	}
}
