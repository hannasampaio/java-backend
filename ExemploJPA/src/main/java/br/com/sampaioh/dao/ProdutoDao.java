/**
 * 
 */
package br.com.sampaioh.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sampaio.domain.Produto;

/**
 * 
 */
public class ProdutoDao implements IProdutoDao {

	@Override
	public Produto cadastrar(Produto produto) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
			
		entityManager.getTransaction().begin();
		entityManager.persist(produto);
		entityManager.getTransaction().commit();
			 
		entityManager.close();
		entityManagerFactory.close();
			
		return produto;
	}
}

