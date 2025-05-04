package br.com.sampaioh.dao.jpa;

import br.com.sampaioh.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.sampaioh.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
