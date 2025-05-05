package ex6;

class Conteudo {
	private String titulo;
	private String descricao;
	
	Conteudo(){
		
	}
	
	Conteudo(String titulo, String descricao) {	
		this.titulo = titulo;
		this.descricao = descricao;
	}

	String getTitulo() {
		return titulo;
	}

	void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	String getDescricao() {
		return descricao;
	}

	void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	void exibirDetalhes() {
		System.out.println(" " + getTitulo());
		System.out.println(getDescricao());
	}
	
	void exibirDetalhes(boolean comResumo) {
		if(!comResumo) {
			exibirDetalhes();
		}else {
			System.out.println(getDescricao());
		}
	}
}
