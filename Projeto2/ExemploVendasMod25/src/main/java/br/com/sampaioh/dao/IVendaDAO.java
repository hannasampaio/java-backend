package br.com.sampaioh.dao;

import br.com.sampaioh.dao.generic.IGenericDAO;
import br.com.sampaioh.domain.Venda;
import br.com.sampaioh.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
