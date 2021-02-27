package ec.edu.ups.RemedialVeletangaVinicio.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.RemedialVeletangaVinicio.modelo.Libro;

@Stateless
public class LibroDAO {
	@PersistenceContext(name = "RemedialVeletangaVinicioPersistenceUnit")
	private EntityManager em;

	public void insert(Libro l) {
		em.persist(l);
	}

	public Libro read(int id) {
		return em.find(Libro.class, id);

	}

	public List<Libro> ConsultaLibros() {

		String jpql = "Select l from libro ";
		Query q = em.createQuery(jpql, Libro.class);
		return q.getResultList();
	}

	public void Reservar(Libro l) {
		em.merge(l);
	}

}
