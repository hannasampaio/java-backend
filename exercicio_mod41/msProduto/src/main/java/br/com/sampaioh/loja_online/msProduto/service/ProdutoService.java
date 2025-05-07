
package br.com.sampaioh.loja_online.msProduto.service;

import br.com.sampaioh.loja_online.msProduto.model.Produto;
import br.com.sampaioh.loja_online.msProduto.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public Produto alterar(Produto produto) {
        return repository.save(produto);
    }

    public Optional<Produto> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }
}
