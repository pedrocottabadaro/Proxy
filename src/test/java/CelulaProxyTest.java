import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
class CelulaProxyTest {
    @BeforeEach
    void setUp() {
        BD.addCelula(new Celula(1, "Cardiovascular", "10", 1));
        BD.addCelula(new Celula(2, "Pulmonar", "30", 2));
    }

    @Test
    void deveRetornaDadosCelula() {
        CelulaProxy celula = new CelulaProxy(1);
        assertEquals(Arrays.asList("Cardiovascular", "10"), celula.getDados());
    }

    @Test
    void devePassarCheckup() {
        LugarSistemaImunologico lugarSistemaImunologico = new LugarSistemaImunologico("Pulmao Esquerdo", 2);
        CelulaProxy celula = new CelulaProxy(2);

        assertEquals("Celula verificada Pulmao Esquerdo", celula.checkup(lugarSistemaImunologico));
    }

    @Test
    void deveGerarExcecaoCheckup() {
        try {
            LugarSistemaImunologico lugarSistemaImunologico = new LugarSistemaImunologico("Figado", 5);
            CelulaProxy celula = new CelulaProxy(2);
            celula.checkup(lugarSistemaImunologico);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Celula será finalizada",
                    e.getMessage() );
        }
    }
}