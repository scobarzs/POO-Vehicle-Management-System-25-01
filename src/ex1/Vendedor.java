package ex1;

public class Vendedor extends Funcionario{
	private double vendasMensais;
	private double comissaoPercentual;
	
	Vendedor(){
		
	}
	Vendedor(String nome,double salarioBase,String cargo,String departamento,double vendasMensais){
		super(nome,salarioBase,cargo,departamento);
		this.vendasMensais = vendasMensais;
		comissaoPercentual = vendasMensais*0.5;
	}
	double getVendasMensais() {
		return vendasMensais;
	}
	void setVendasMensais(double vendasMensais) {
		this.vendasMensais = vendasMensais;
	}
	double getComissaoPercentual() {
		return comissaoPercentual;
	}
	void setComissaoPercentual(double comissaoPercentual) {
		this.comissaoPercentual = comissaoPercentual;
	}
	
	@Override
	double calcularSalario(){
		return getSalarioBase()+getComissaoPercentual();
	}
	
	@Override 
	void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Vendas Mensais: " + getVendasMensais());
		System.out.println("Comissão: "  + getComissaoPercentual());
	}
	
	@Override
	void exibirInformacoes(String adicional) {
		exibirInformacoes();
		System.out.println("Dados Adicionais: " + adicional);
	}
	
}
