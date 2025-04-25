package br.com.sampaioh.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.sampaioh.dao.Persistente;
import br.com.sampaioh.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericService <T extends Persistente, E extends Serializable> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    public void excluir(E valor);

    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    public T consultar(E valor);

    public Collection<T> buscarTodos();

}
