package br.com.sampaioh.dao.jpa;

import br.com.sampaioh.dao.generic.jpa.IGenericJapDAO;
import br.com.sampaioh.domain.jpa.VendaJpa;
import br.com.sampaioh.exceptions.DAOException;
import br.com.sampaioh.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

	public VendaJpa consultarComCollection(Long id);
}
