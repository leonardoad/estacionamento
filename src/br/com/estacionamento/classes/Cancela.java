package br.com.estacionamento.classes;

public class Cancela {
	
	private boolean isClosed;
	
	public Cancela() {
		// TODO Auto-generated constructor stub
	}
	
	public void abrirCancela() {
		// TODO
		this.setIsClosed(false);
	}
	
	public void fecharCancela() {
		// TODO
		this.setIsClosed(true);
	}

	public boolean getIsClosed() {
		return this.isClosed;
	}
	
	private void setIsClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}
	
}
