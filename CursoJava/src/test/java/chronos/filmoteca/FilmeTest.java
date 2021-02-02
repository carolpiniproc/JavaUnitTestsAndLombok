package chronos.filmoteca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmeTest {

    @Test
    public void testFilme(){
        Filme nomefilme = new Filme("Divertidamente", 1.45, "livre");
        assertEquals("Divertidamente", nomefilme.getNome());
    }

    @Test
    public void testFilmeVazio(){
        Filme filme = new Filme();
        assertEquals(null, filme.getFaixaEtaria());
    }
}
