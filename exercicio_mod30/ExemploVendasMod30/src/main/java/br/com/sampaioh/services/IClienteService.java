package br.com.sampaioh.services;

import br.com.sampaioh.domain.Cliente;
import br.com.sampaioh.exceptions.DAOException;
import br.com.sampaioh.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

}
