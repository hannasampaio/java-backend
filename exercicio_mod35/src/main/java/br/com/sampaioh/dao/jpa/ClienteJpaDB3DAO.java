package br.com.sampaioh.dao.jpa;

import br.com.sampaioh.dao.generic.jpa.GenericJpaDB3DAO;
import br.com.sampaioh.domain.jpa.ClienteJpa2;

public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}
