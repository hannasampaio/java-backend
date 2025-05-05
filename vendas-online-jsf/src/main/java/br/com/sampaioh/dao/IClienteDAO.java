package br.com.sampaioh.dao;

import java.util.List;

import br.com.sampaioh.dao.generic.IGenericDAO;
import br.com.sampaioh.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
