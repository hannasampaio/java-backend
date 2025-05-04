package br.com.sampaioh.dao.jpa;

import br.com.sampaioh.dao.generic.jpa.GenericJpaDAO;
import br.com.sampaioh.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
