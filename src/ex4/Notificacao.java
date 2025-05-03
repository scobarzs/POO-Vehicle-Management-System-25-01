package ex4;

class Notificacao {
	private String mensagem;
	private String destinatario;
	private String assunto;
	
	Notificacao(String mensagem, String destinatario){
		this.mensagem = mensagem;
		this.destinatario = destinatario;
	}
	
	String getMensagem() {
		return mensagem;
	}
	
	String getDestinatario() {
		return destinatario;
	}
	
	String getAssunto() {
		return assunto;
	}
	void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	void enviar() {
		System.out.println("Mensagem: " + getMensagem());
		System.out.println("Destinatario: " + getDestinatario());
	}
	
	void enviar(String assunto) {
		if(assunto != null)System.out.println("Assunto: " + assunto);
		System.out.println("Mensagem: " + getMensagem());
		System.out.println("Destinatario: " + getDestinatario());
	}
	
}
