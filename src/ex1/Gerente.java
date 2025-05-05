package ex1;

public class Gerente extends Funcionario{
	private double bonusPercentual;
	
	Gerente(){
		
	}
	Gerente(String nome,double salarioBase,String cargo,String departamento){
		super(nome,salarioBase,cargo,departamento);
		bonusPercentual = getSalarioBase()*0.2;
	}
	
	double getBonusPercentual() {
		return bonusPercentual;
	}
	
	@Override
	double calcularSalario() {
		return getSalarioBase()+getBonusPercentual();
	}
	
	@Override
	void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Bonus: " + getBonusPercentual());
	}
	
	@Override
	void exibirInformacoes(String adicional) {
		exibirInformacoes();
		System.out.println("Dados Adicionais: " + adicional);
	}
	
}
