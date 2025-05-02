package br.com.sampaioh;

import br.com.sampaioh.domain.model.Carro;
import br.com.sampaioh.domain.model.Marca;
import br.com.sampaioh.domain.repository.CarroRepository;
import br.com.sampaioh.service.impl.CarroService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarroServiceTest {
    @Autowired
    private CarroRepository repository;

    @Autowired
    private CarroService service;

    @Test
    void saveAndFindAllTest() {
        Carro x1 = new Carro("X1", new Marca("BMW"));
        Carro x3 = new Carro("X3", new Marca("BMW"));

        service.save(x1);
        service.save(x3);

        List<Carro> carros = service.findAll();

        assertEquals(2, carros.size());
    }

    @Test
    void findByIdAndDeleteTest() {
        Carro escalade = service.save(
                new Carro("Civic",
                new Marca("Honda")));

        Carro carroBuscado = service.findById(escalade.getId());

        assertNotNull(carroBuscado);
        assertEquals(escalade.getId(), carroBuscado.getId());
        assertEquals(escalade.getModelo(), carroBuscado.getModelo());

        service.delete(escalade.getId());

        assertFalse(repository.existsById(escalade.getId()));
    }
}
