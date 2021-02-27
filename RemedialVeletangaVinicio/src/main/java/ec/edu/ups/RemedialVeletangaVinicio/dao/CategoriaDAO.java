package ec.edu.ups.RemedialVeletangaVinicio.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.RemedialVeletangaVinicio.modelo.Categoria;

@Stateless
public class CategoriaDAO {
	@PersistenceContext(name = "RemedialVeletangaVinicioPersistenceUnit")
	private EntityManager em;

	public List<Categoria> ListarCategoria() {

		String jpql = "Select ca from categoria ";
		Query q = em.createQuery(jpql, Categoria.class);
		return q.getResultList();
	}

}
