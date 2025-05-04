package br.com.sampaioh.services;

import br.com.sampaioh.dao.IProdutoDAO;
import br.com.sampaioh.domain.Produto;
import br.com.sampaioh.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
