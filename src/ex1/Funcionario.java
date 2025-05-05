package ex1;

public class Funcionario {
	private String nome;
	private double salarioBase;
	private String cargo;
	private String departamento;
	
	Funcionario(){
		
	}
	Funcionario(String nome,double salarioBase,String cargo,String departamento){
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.cargo = cargo;
		this.departamento = departamento;
	}
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	double getSalarioBase() {
		return salarioBase;
	}
	void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	String getCargo() {
		return cargo;
	}
	void setCargo(String cargo) {
		this.cargo = cargo;
	}
	String getDepartamento() {
		return departamento;
	}
	void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	double calcularSalario() {
		return getSalarioBase();
	}
	
	void exibirInformacoes() {
		System.out.println("Nome: " + getNome());
		System.out.println("Salário: " + calcularSalario());
		System.out.println("Cargo: " + getCargo());
		System.out.println("Departamento: " + getDepartamento());
	}
	
	void exibirInformacoes(String adicional) {
		exibirInformacoes();
		System.out.println("Dados Adicionais: " + adicional);
	}
	
}
