package br.com.sampaioh.dao.jpa;

import br.com.sampaioh.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.sampaioh.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
