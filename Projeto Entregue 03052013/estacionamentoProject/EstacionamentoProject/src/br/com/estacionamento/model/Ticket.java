package br.com.estacionamento.model;

import java.util.Calendar;

import javax.persistence.Entity;

@Entity
public class Ticket extends BasicEntity{

	private static final long serialVersionUID = 1L;
	private Calendar data;
	private Calendar horaEntrada;
	private Calendar horaSaida;


	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Calendar getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(Calendar horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Calendar getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(Calendar horaSaida) {
		this.horaSaida = horaSaida;
	}

	
}
