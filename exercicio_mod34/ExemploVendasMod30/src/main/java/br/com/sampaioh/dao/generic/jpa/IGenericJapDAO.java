package br.com.sampaioh.dao.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.sampaioh.dao.Persistente;
import br.com.sampaioh.exceptions.DAOException;
import br.com.sampaioh.exceptions.MaisDeUmRegistroException;
import br.com.sampaioh.exceptions.TableException;
import br.com.sampaioh.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericJapDAO <T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}
