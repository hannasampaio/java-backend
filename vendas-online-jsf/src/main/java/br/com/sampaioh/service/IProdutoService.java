package br.com.sampaioh.service;

import java.util.List;

import br.com.sampaioh.domain.Produto;
import br.com.sampaioh.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
