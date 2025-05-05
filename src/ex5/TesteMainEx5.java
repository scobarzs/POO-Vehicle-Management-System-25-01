package ex5;

public class TesteMainEx5 {
	
	public static void main(String[]args) {
		PagamentoBoleto boleto1 = new PagamentoBoleto(38.00,"Multa sobre Limite de Velocidade Ultrapassado","88937200");
		PagamentoCartao cartao1 = new PagamentoCartao(400,"Shoppee: Vestido Bege, Alta Costura Italiana","78881820");
		Pagamento pagamento1 = new Pagamento(25.99,"Pastelão da Esquina");
		PagamentoCartao cartao2 = new PagamentoCartao(1710,"Silvano: Pagamento do Aluguel em Apartamento","78881820");
		PagamentoBoleto boleto2 = new PagamentoBoleto(670.64,"Pensão Alimentícia","684229913");
		PagamentoBoleto boleto3 = new PagamentoBoleto(78.32,"Free Fire Boletos, 1000 diamantes","69696969");
		
		System.out.println("Pagamentos do Mês\n\n1.");
		
		boleto1.processarPagamento();
		System.out.println("\n2.");
		boleto3.processarPagamento(10);
		System.out.println("\n3.");
		pagamento1.processarPagamento(3);
		System.out.println("\n4.");
		cartao1.processarPagamento(25);
		System.out.println("\n5.");
		cartao2.processarPagamento();
		System.out.println("\n6.");
		boleto2.processarPagamento();
	}
	
}
