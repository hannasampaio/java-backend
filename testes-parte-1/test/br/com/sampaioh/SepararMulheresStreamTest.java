package br.com.sampaioh;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SepararMulheresStreamTest {

    @Test
    public void deveSepararApenasNomesFemininos() {
        String entrada = "Rita-F, Caio-M, Ana-F, João-M, Bia-F";
        List<String> resultado = SepararMulheresStream.separarNomesFemininos(entrada);
        assertEquals(List.of("Rita", "Ana", "Bia"), resultado);
    }
}

