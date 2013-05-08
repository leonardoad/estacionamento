package br.com.estacionamento.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.estacionamento.model.Usuario;

public class Usuarios {

	/**
	 * @FIXME
	 */
	private void adicionar() {

		// Iniciando o Framework JPA Hibernate
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("estacionamentoPU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();

		tx.commit();

		em.close();
		emf.close();

	}

	// método para validar a senha
	public Usuario retornaUsuario(String nomeConsultaStr,
			String senhaConsultaStr) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("estacionamentoPU");
		EntityManager em = emf.createEntityManager();

		String queryJPL = "select object(u) from Usuario u where u.nome = :nome AND u.senha = :senha";
		
		TypedQuery<Usuario> query = em.createQuery(queryJPL, Usuario.class);
		query.setParameter("nome", nomeConsultaStr);
		query.setParameter("senha", senhaConsultaStr);

		Usuario u = query.getSingleResult();

		// SELECT
		em.close();
		emf.close();

		if (u != null) {
			return u;
		}

		return null;
	}
}
