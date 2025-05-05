package br.com.sampaioh.service;

import java.util.List;

import br.com.sampaioh.domain.Cliente;
import br.com.sampaioh.exceptions.DAOException;
import br.com.sampaioh.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
