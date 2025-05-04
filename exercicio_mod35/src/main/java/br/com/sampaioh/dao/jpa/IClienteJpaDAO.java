package br.com.sampaioh.dao.jpa;

import br.com.sampaioh.dao.generic.jpa.IGenericJapDAO;
import br.com.sampaioh.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
