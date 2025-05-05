package ex6;

class VideoAula extends Conteudo{
	private int duracaoMin;

	VideoAula() {
		super();
	}

	VideoAula(String titulo, String descricao, int duracaoMin) {
		super(titulo, descricao);
		this.duracaoMin = duracaoMin;
	}

	int getDuracaoMin() {
		return duracaoMin;
	}

	void setDuracaoMin(int duracaoMin) {
		this.duracaoMin = duracaoMin;
	}
	
	@Override
	void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Duração: " + getDuracaoMin() + "min");
	}
	
	@Override
	void exibirDetalhes(boolean comResumo) {
		if(!comResumo) {
			exibirDetalhes();
		}else {
			System.out.println(getDescricao());
			System.out.println("Duração: " + getDuracaoMin() + "min");
		}
	}
}
