package br.com.estacionamento.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

@MappedSuperclass
public class BasicEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bolinha")
	@SequenceGenerator(name = "bolinha", sequenceName = "Estacionamento_seq", initialValue = 1, allocationSize = 1)
	public Long getId() {
		return id;
	}
	
	@SuppressWarnings("unused")
	private void setId(Long id) {
		this.id = id;
	}

	

}
