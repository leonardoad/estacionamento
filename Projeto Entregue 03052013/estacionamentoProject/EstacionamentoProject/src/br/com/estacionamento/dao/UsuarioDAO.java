package br.com.estacionamento.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.estacionamento.model.Usuario;

public class UsuarioDAO {

	private static EntityManagerFactory emf;

	static {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("estacionamentoPU");
		}
	}

	private static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public void gravarTodos(List<Usuario> usuarios) {

		EntityManager em = null;
		try {

			em = getEntityManager();
			em.getTransaction().begin();

			for (Usuario u : usuarios) {
				em.persist(u); // M.O.R via JPA !!!!
			}

			em.getTransaction().commit();

		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

	public List<Usuario> recuperarTodos() {
		return null;
	}

	// Método para CREATE
	public void create(Usuario u) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(u);
			em.getTransaction().commit();
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

	// Método para UPDATE
	public void update(Usuario u) throws Exception {
		EntityManager em = null;
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.merge(u);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

	// Método para DELETE
	public void delete(Long id) throws Exception {
		EntityManager em = null;
		try {
			em = getEntityManager();
			em.getTransaction().begin();

			Usuario u = em.find(Usuario.class, id);
			em.remove(u);
			
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

	// Método para RETRIEVE
	public Usuario findById(Long id) {
		EntityManager em = null;
		Usuario u = null;
		try {
			em = getEntityManager();
			u = em.find(Usuario.class, id);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return u;
	}
}
