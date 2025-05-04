package br.com.sampaioh.dao.jpa;

import br.com.sampaioh.dao.generic.jpa.GenericJpaDAO;
import br.com.sampaioh.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
