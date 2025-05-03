package ex3;

public class TesteMainEx3 {

	public static void main(String[] args) {
		QuartoSimples quartoSimples = new QuartoSimples(34,150.50,"Bicama Solteiro",2);
		Suite suite = new Suite(29,400.00,"Suite Presidencial","Atendimento 24h");
		quartoSimples.calcularDiaria(6);
		suite.calcularDiaria(20);
		System.out.println("QUARTO SIMPLES\n");
		quartoSimples.exibirInformacoes(true);
		System.out.println("\nSUITE\n");
		suite.exibirInformacoes(true);
		
		
	}

}
