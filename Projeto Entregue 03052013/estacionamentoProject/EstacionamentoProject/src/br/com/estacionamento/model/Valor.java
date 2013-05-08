package br.com.estacionamento.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class Valor extends BasicEntity{

	private static final long serialVersionUID = 1L;
	
	private BigDecimal valorHora;
	

	public BigDecimal getValorHora() {
		return valorHora;
	}

	public void setValorHora(BigDecimal valorHora) {
		this.valorHora = valorHora;
	}
}
