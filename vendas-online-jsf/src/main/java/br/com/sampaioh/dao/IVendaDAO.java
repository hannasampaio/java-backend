package br.com.sampaioh.dao;

import br.com.sampaioh.dao.generic.IGenericDAO;
import br.com.sampaioh.domain.Venda;
import br.com.sampaioh.exceptions.DAOException;
import br.com.sampaioh.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, Long>{

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

	public Venda consultarComCollection(Long id);

}
