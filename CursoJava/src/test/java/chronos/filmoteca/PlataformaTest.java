package chronos.filmoteca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlataformaTest {

    @Test
    public void testConstrutorAtivo(){
        Plataforma netflix;
        netflix = new Plataforma("Netflix", "www.netflix.com.br",49.90);
        boolean ativo = netflix.isStatus();
        assertTrue(ativo);
    }


    @Test
    public void testGetSet(){
        Plataforma disneyPlus = new Plataforma();
        disneyPlus.setStatus(false);
        disneyPlus.setAssinantes(300000000L);
        disneyPlus.setMensalidade(30.90);
        disneyPlus.setNome("Disney+");
        disneyPlus.setUrl("www.disneyplus.com");

        assertFalse(disneyPlus.isStatus());
        assertEquals(300000L, disneyPlus.getAssinantes());
        assertEquals("Disney+", disneyPlus.getNome());


        }



}
