package ex4;

class EmailNotificacao extends Notificacao{
	private String enderecoEmail;

	EmailNotificacao(String mensagem,String destinatario,String enderecoEmail){
		super(mensagem,destinatario);
		this.enderecoEmail = enderecoEmail;
	}
	
	String getEnderecoEmail() {
		return enderecoEmail;
	}
	
	@Override
	void enviar() {
		System.out.println(getEnderecoEmail());
		super.enviar();
	}
	
	@Override
	void enviar(String assunto) {
		System.out.println(getEnderecoEmail());
		super.enviar(assunto);
	}
}
