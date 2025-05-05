package ex6;

public class TesteMainEx6 {
	public static void main(String[]args) {
		VideoAula video = new VideoAula("Física Nuclear, Perigos e Respostas","Aula 6 do curso de Física Quântica. Abordagem das vertentes da física",180);
		Artigo artigo = new Artigo("A ultíma vez em que os humanos foram bons","Esse artigo aborda as maiores burradas da humanidade, explorando seus contextos e problemas",820);
	
		System.out.println("Com Resumo\n");
		video.exibirDetalhes(true);
		System.out.println("\n");
		artigo.exibirDetalhes(true);
	
		System.out.println("\nSem Resumo\n");
		video.exibirDetalhes();
		System.out.println("\n");
		artigo.exibirDetalhes();
	
	}
}
