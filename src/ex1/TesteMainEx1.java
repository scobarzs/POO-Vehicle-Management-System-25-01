package ex1;
import java.util.ArrayList;
import java.util.Scanner;

public class TesteMainEx1 {

	static void menu() {
		System.out.println("\n Menu \n");
		System.out.println("1 - Cadastrar um Vendedor ");
		System.out.println("2 - Cadastrar um Gerente ");
		System.out.println("3 - Vizualizar Funcionarios");
		System.out.println("4 - Sair ");
	}
	
	static Vendedor cadastroVendedor() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = input.next();
		System.out.println("Salario Base: ");
		double salario = input.nextDouble();
		System.out.println("Cargo: ");
		String cargo = input.next();
		System.out.println("Departamento: ");
		String departamento = input.next();
		System.out.println("Vendas Mensais: ");
		double vendas = input.nextDouble();
		
		Vendedor vendedor = new Vendedor(nome,salario,cargo,departamento);
		vendedor.setVendasMensais(vendas);
		vendedor.setComissaoPercentual();
		vendedor.calcularSalario();
		return vendedor;
	}
	
	static Gerente cadastroGerente() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = input.next();
		System.out.println("Salario Base: ");
		double salario = input.nextDouble();
		System.out.println("Cargo: ");
		String cargo = input.next();
		System.out.println("Departamento: ");
		String departamento = input.next();
		
		Gerente gerente = new Gerente(nome,salario,cargo,departamento);
		gerente.setBonusPercentual();
		gerente.calcularSalario();
		
		return gerente;
	
	}

	static void vizualizarFuncionarios(ArrayList<Vendedor> venda,ArrayList<Gerente> gerent) {
		System.out.println("\n Vendedores: ");
		for(Vendedor vendedor:venda) {
			System.out.println("\n");
			vendedor.exibirInformacoes();
		}
		System.out.println("\n Gerentes: ");
		for(Gerente gerente:gerent) {
			System.out.println("\n");
			gerente.exibirInformacoes();
		}
	}
	
	static void saida() {
		System.out.println("Até mais!");
		System.out.println("Saindo...");
	}
	
	
	public static void main(String[] args) {
		ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
		ArrayList<Gerente> gerentes= new ArrayList<Gerente>();
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		
		do {
			menu();
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:vendedores.add(cadastroVendedor());break;
			case 2:gerentes.add(cadastroGerente());break;
			case 3:vizualizarFuncionarios(vendedores,gerentes);break;
			case 4:saida();break;
			default:System.out.println("ERROR!!");;
			}
			
		}while(opcao!=4);
		
		teclado.close();
	}

}
