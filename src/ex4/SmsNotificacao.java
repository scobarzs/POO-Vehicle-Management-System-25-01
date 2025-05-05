package ex4;

class SmsNotificacao extends Notificacao{
	private String numeroTelefone;
	
	SmsNotificacao(String mensagem,String destinatario,String numeroTelefone) {
		super(mensagem,destinatario);
		this.numeroTelefone = numeroTelefone;
	}
	
	String getNumeroTelefone() {
		return numeroTelefone;
	}
	
	@Override
	void enviar() {
		System.out.println(getNumeroTelefone());
		super.enviar();
	}
	
	@Override
	void enviar(String assunto) {
		System.out.println(getNumeroTelefone());
		super.enviar(assunto);
	}
}
