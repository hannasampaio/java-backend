package br.com.sampaioh.services;

import br.com.sampaioh.dao.IClienteDAO;
import br.com.sampaioh.domain.Cliente;
import br.com.sampaioh.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);

	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}

}
