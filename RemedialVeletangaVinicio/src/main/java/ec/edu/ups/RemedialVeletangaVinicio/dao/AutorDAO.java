package ec.edu.ups.RemedialVeletangaVinicio.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.RemedialVeletangaVinicio.modelo.Autor;

@Stateless
public class AutorDAO {
	@PersistenceContext(name = "RemedialVeletangaVinicioPersistenceUnit")
	private EntityManager em;

	public Autor read(String cedula) {
		return em.find(Autor.class, cedula);

	}

	public List<Autor> getAutores() {

		String jpql = "Select c from autor ";
		Query q = em.createQuery(jpql, Autor.class);
		return q.getResultList();
	}

}
