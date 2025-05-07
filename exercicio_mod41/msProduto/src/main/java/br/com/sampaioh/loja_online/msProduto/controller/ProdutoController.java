
package br.com.sampaioh.loja_online.msProduto.controller;

import br.com.sampaioh.loja_online.msProduto.model.Produto;
import br.com.sampaioh.loja_online.msProduto.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public Produto cadastrar(@RequestBody Produto produto) {
        return service.salvar(produto);
    }

    @PutMapping
    public Produto alterar(@RequestBody Produto produto) {
        return service.alterar(produto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Produto> listarTodos() {
        return service.listarTodos();
    }
}
