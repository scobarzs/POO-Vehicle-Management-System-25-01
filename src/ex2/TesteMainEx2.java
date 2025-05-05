package ex2;

public class TesteMainEx2 {
	public static void main(String[]args) {
		ProdutoEletronico eletronico = new ProdutoEletronico("Computador",3_000,"Software: Windows 10\nProcessador: Intel 5\nMemória: 3TB",5,true);
		ProdutoVestuario vestuario = new ProdutoVestuario("Calça Jeans",49.99, "Modelo: Feminino\nFabricante: JeansMax", 10, "M", false);
		eletronico.calcularPrecoFinal();
		vestuario.calcularPrecoFinal();
		
		System.out.println("Sem ESTOQUE:\n");
		eletronico.exibirDetalhes();
		System.out.println();
		vestuario.exibirDetalhes();
		
		System.out.println("\nCom ESTOQUE:\n");
		eletronico.exibirDetalhes(true);
		System.out.println();
		vestuario.exibirDetalhes(true);

	}
}
