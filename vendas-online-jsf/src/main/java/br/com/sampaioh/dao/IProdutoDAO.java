package br.com.sampaioh.dao;

import java.util.List;

import br.com.sampaioh.dao.generic.IGenericDAO;
import br.com.sampaioh.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
