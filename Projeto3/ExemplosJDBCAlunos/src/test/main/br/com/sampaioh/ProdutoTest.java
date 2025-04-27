package br.com.sampaioh;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import br.com.sampaioh.dao.IProdutoDAO;
import br.com.sampaioh.dao.ProdutoDAO;
import br.com.sampaioh.domain.Produto;

public class ProdutoTest {

    @Test
    public void cadastrarProdutoTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();
        Produto produto = new Produto();
        produto.setCodigo("P01");
        produto.setNome("Teclado");
        produto.setPreco(199.90);

        Integer qtd = dao.cadastrar(produto);
        assertTrue(qtd == 1);

        Produto produtoBD = dao.consultar(produto.getCodigo());
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getPreco(), produtoBD.getPreco());

        produtoBD.setNome("Teclado Mecânico");
        produtoBD.setPreco(299.90);
        Integer qtdAtualizar = dao.atualizar(produtoBD);
        assertTrue(qtdAtualizar == 1);

        Produto produtoAtualizado = dao.consultar(produto.getCodigo());
        assertEquals("Teclado Mecânico", produtoAtualizado.getNome());
        assertEquals(Double.valueOf(299.90), produtoAtualizado.getPreco());

        List<Produto> produtos = dao.buscarTodos();
        assertTrue(produtos.size() > 0);

        Integer qtdDel = dao.excluir(produtoAtualizado);
        assertNotNull(qtdDel);
    }
}
