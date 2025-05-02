package br.com.sampaioh;

import br.com.sampaioh.domain.model.Acessorio;
import br.com.sampaioh.domain.model.Carro;
import br.com.sampaioh.domain.model.Marca;
import br.com.sampaioh.domain.repository.AcessorioRepository;
import br.com.sampaioh.service.impl.AcessorioService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AcessorioServiceTest {
    @Autowired
    private AcessorioRepository repository;
    @Autowired
    private AcessorioService service;

    @Test
    void saveAndFindAllTest() {
        Marca Renault = new Marca("Renault");
        Carro Captur = new Carro("Captur", Renault);
        Acessorio turbo = new Acessorio("Turbo", Captur);
        Acessorio injecaoModificada = new Acessorio("Injecao Modificada", Captur);

        service.save(turbo);
        service.save(injecaoModificada);

        List<Acessorio> acessorios = service.findAll();

        assertEquals(2, acessorios.size());
    }

    @Test
    void findByIdAndDeleteTest() {
        Acessorio fume = service.save(new Acessorio("Vidro fume"));

        Acessorio acessorioBuscado = service.findById(fume.getId());

        assertNotNull(acessorioBuscado);
        assertEquals(fume.getId(), acessorioBuscado.getId());
        assertEquals(fume.getNome(), acessorioBuscado.getNome());

        service.delete(fume.getId());

        assertFalse(repository.existsById(fume.getId()));
    }
}
