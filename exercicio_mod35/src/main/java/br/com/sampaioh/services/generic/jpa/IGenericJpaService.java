package br.com.sampaioh.services.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.sampaioh.domain.jpa.Persistente;
import br.com.sampaioh.exceptions.DAOException;
import br.com.sampaioh.exceptions.MaisDeUmRegistroException;
import br.com.sampaioh.exceptions.TableException;
import br.com.sampaioh.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericJpaService <T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}
