package ex6;

class Artigo extends Conteudo{
	private int numeroPalavras;

	Artigo(){
		super();
	}
	
	Artigo(String titulo, String descricao,int numeroPalavras) {
		super(titulo,descricao);
		this.numeroPalavras = numeroPalavras;
	}
	
	int getNumeroPalavras() {
		return numeroPalavras;
	}

	void setNumeroPalavras(int numeroPalavras) {
		this.numeroPalavras = numeroPalavras;
	}

	@Override
	void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Numero de Palavras: " + getNumeroPalavras());
	}
	
	@Override
	void exibirDetalhes(boolean comResumo) {
		if(!comResumo) {
			exibirDetalhes();
		}else {
			System.out.println(getDescricao());
			System.out.println("Numero de Palavras: " + getNumeroPalavras());
		}
	}
	
}
