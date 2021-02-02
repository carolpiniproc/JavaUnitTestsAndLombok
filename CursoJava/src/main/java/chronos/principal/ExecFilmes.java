package chronos.principal;

import chronos.filmoteca.Filme;
import chronos.filmoteca.Plataforma;
import java.util.ArrayList;
import java.util.List;

public class ExecFilmes {

    public static void main(String[]args){

        Plataforma netflix = new Plataforma("netflix", "www.netflix.com.br", 49.99, 600000000L);
        Filme oPoco = new Filme("O Poço", 1.30, "+16");
        Filme birdBox = new Filme("Caixa de Passáros", 1.50, "+14");

        List<Filme> filmes = new ArrayList<>();
        filmes.add(oPoco);
        filmes.add(birdBox);

        netflix.setFilmes(filmes);

        System.out.println(netflix.toString());

        for(int i=0; i < netflix.getFilmes().size(); i++){
            String nomeFilme = netflix.getFilmes().get(i).getNome();
            System.out.println(nomeFilme);
        }

        for (Filme filme: netflix.getFilmes()) {
            String nomeFilme = filme.getNome();
            System.out.println(nomeFilme);
        }

    }

}
