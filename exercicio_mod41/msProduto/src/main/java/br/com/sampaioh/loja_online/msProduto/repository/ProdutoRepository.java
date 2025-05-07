
package br.com.sampaioh.loja_online.msProduto.repository;

import br.com.sampaioh.loja_online.msProduto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
