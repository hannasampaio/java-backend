package br.com.sampaioh.dao;

import br.com.sampaioh.domain.Produto;

import java.util.List;

public interface IProdutoDAO {
    public Integer cadastrar(Produto produto) throws Exception;
    public Integer atualizar(Produto produto) throws Exception;
    public Produto consultar(String codigo) throws Exception;
    public List<Produto> buscarTodos() throws Exception;
    public Integer excluir(Produto produto) throws Exception;
}
