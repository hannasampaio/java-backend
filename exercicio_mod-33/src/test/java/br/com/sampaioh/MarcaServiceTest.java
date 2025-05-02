package br.com.sampaioh;

import br.com.sampaioh.domain.model.Marca;
import br.com.sampaioh.domain.repository.MarcaRepository;
import br.com.sampaioh.service.impl.MarcaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
public class MarcaServiceTest {
    @Autowired
    private MarcaRepository repository;
    @Autowired
    private MarcaService service;

    @Test
    void saveAndFindAllTest() {
        Marca marca1 = new Marca("BMW");
        Marca marca2 = new Marca("Mercedez");

        service.save(marca1);
        service.save(marca2);

        List<Marca> marcas = service.findAll();

        assertEquals(2, marcas.size());
    }

    @Test
    void findByIdAndDeleteTest() {
        Marca marca = service.save(new Marca("Honda"));

        Marca marcaBuscada = service.findById(marca.getId());

        assertNotNull(marcaBuscada);
        assertEquals(marca.getId(), marcaBuscada.getId());
        assertEquals(marca.getNome(), marcaBuscada.getNome());

        service.delete(marca.getId());

        assertFalse(repository.existsById(marca.getId()));
    }
}
