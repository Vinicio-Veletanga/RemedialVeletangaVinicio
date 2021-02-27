package ec.edu.ups.RemedialVeletangaVinicio.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.RemedialVeletangaVinicio.modelo.Autor;

public class CategoriaDAO {
	@PersistenceContext(name="RemedialVeletangaVinicioPersistenceUnit")
	private EntityManager em;
	
	 
	
	 
	
	public List<Autor> getAutores(){
		
		String jpql = "Select c from categoria ";
		Query q = em.createQuery(jpql, Autor.class);
		return  q.getResultList();
	}


}
