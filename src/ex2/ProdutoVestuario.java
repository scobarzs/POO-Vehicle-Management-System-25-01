package ex2;

public class ProdutoVestuario extends Produto{
	private String tamanho;
	private boolean emPromocao;
	
	protected ProdutoVestuario(String name,double preco,String descricao,int estoque,String tamanho,boolean emPromocao) {
		super(name,preco,descricao,estoque);
		this.tamanho = tamanho;
		this.emPromocao = emPromocao;
	}

	protected String getTamanho() {
		return tamanho;
	}

	protected void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	protected boolean isEmPromocao() {
		return emPromocao;
	}

	protected void setEmPromocao(boolean emPromocao) {
		this.emPromocao = emPromocao;
	}
	

	@Override
	protected double calcularPrecoFinal() {
		double desconto;
		if(!emPromocao) {
			desconto = 0;
		}else {
			desconto = getPreco()*0.10;
		}
		setPreco(getPreco()-desconto);
		return getPreco();
	}
	
	@Override
	protected void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Tamanho: " + getTamanho());
		String promocao = (isEmPromocao()==true)?"Sim": "Não";
		System.out.println("Promocão: " + promocao);
	}
	
	@Override
	protected void exibirDetalhes(boolean comEstoque) {
		super.exibirDetalhes(comEstoque);
		System.out.println("Tamanho: " + getTamanho());
		String promocao = (isEmPromocao()==true)?"Sim": "Não";
		System.out.println("Promocão: " + promocao);
	}
}