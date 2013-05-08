package br.com.estacionamento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="USUARIOS")
public class Usuario extends BasicEntity {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String senha;
	private Cargo cargo;

	@Column(length = 80, nullable = false, unique = false)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(length = 11, unique = true)
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Enumerated(EnumType.ORDINAL)
	@Column(nullable=false)
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}
