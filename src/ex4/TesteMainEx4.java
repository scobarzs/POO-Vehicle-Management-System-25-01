package ex4;

public class TesteMainEx4 {
	public static void main(String[]args) {
		EmailNotificacao emailUm = new EmailNotificacao("Assinatura da Netflix precisa de renovação","BigFatPayer","netflix.sup@gmail.com");
		SmsNotificacao smsUm = new SmsNotificacao("TIM: NOVA PROMOÇÃO, PLANO FAMILIA POR 44,99","Arthur Escobar","3030-4498");
		EmailNotificacao emailDois = new EmailNotificacao("Resultado do Exame: Positivo para HIV","Carlos Utter","hospital.geral@gmail.com");
		EmailNotificacao emailTres = new EmailNotificacao("Problemas na Cama? Temos a solução! Ligue para XXXXX-XXXX","InfertilMan","scam.call@gmail.com");
		SmsNotificacao smsDois = new SmsNotificacao("Código de Verificação do Google: G-67491","Arthur Escobar","google@gmail.com");
		
		emailUm.setAssunto(null);
		smsUm.setAssunto("Promoção Plano Internet");
		smsDois.setAssunto(null);
		emailDois.setAssunto("Exames no Hospital Geral do Munícipio");
		emailTres.setAssunto("Infertilidade não é mais um problema");
		
		Notificacao[] notificacao = {emailUm,smsUm,emailDois,emailTres,smsDois};
		
		System.out.println("NOTIFICACOES");
		int i = 0;
		for(Notificacao check:notificacao) {
			i++;
			System.out.println("\nNotificacao: " + i + "\n");
			check.enviar(check.getAssunto());
		}
	}
}
