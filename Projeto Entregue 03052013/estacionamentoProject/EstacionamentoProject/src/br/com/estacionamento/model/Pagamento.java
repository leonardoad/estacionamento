package br.com.estacionamento.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class Pagamento extends BasicEntity{


	private static final long serialVersionUID = 1L;
	
	
	private BigDecimal valorTotal;
	private boolean satusPagamento;
	
	
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public boolean isSatusPagamento() {
		return satusPagamento;
	}
	public void setSatusPagamento(boolean satusPagamento) {
		this.satusPagamento = satusPagamento;
	}
}
