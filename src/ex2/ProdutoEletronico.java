package ex2;

public class ProdutoEletronico extends Produto{
	private boolean garantiaEstendida;
	
	protected ProdutoEletronico(String name,double preco,String descricao,int estoque,boolean temGarantia) {
		super(name,preco,descricao,estoque);
		garantiaEstendida = temGarantia;
	}
	
	
	protected boolean getGarantia() {
		return garantiaEstendida;
	}
	protected void setGarantia(boolean temGarantia) {
		garantiaEstendida = temGarantia;
	}
	
	@Override
	protected double calcularPrecoFinal() {
		double percentual;
		if(!garantiaEstendida) {
			percentual = 0;
		}else {
			percentual = getPreco()*0.15;
		}
		setPreco(getPreco()+percentual);
		return getPreco();
	}
	
	@Override
	protected void exibirDetalhes() {
		super.exibirDetalhes();
		String garantia = (getGarantia()==true)?"Sim": "Não";
		System.out.println("Garantia: " + garantia);
	}
	
	protected void exibirDetalhes(boolean comEstoque) {
		super.exibirDetalhes(comEstoque);
		String garantia = (getGarantia()==true)?"Sim": "Não";
		System.out.println("Garantia: " + garantia);
	}
}
