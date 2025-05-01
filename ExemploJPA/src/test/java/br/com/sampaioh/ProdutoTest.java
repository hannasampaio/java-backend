/**
 * 
 */
package br.com.sampaioh;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.sampaio.domain.Produto;
import br.com.sampaioh.dao.IProdutoDao;
import br.com.sampaioh.dao.ProdutoDao;

/**
 * @author hanna.sampaio
 */
public class ProdutoTest {

	private IProdutoDao produtoDao;
	
	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}

	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setNome("Camisa Adidas");
		produto.setPreco(199.99);
		produto.setQuantidade(2);
		produtoDao.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
		
	}

}