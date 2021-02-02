package chronos.filmoteca;

import java.util.ArrayList;
import java.util.List;


public class Plataforma {
    private String nome;
    private String url;
    private double mensalidade; //duas casas decimais
    private boolean status = true;
    private Long assinantes; //BigInt = Long
    private List<Filme> filmes = new ArrayList<>();

    public Plataforma(String nome, String url, double mensalidade) {
        this.nome = nome;
        this.url = url;
        this.mensalidade = mensalidade;
    }

    public Plataforma(String nome, String url, double mensalidade, Long assinantes) {
        this.nome = nome;
        this.url = url;
        this.mensalidade = mensalidade;
        this.assinantes = assinantes;
    }

    public Plataforma(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setAtivo(){
        this.status = true;
        status = false;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Long getAssinantes() {
        return assinantes;
    }

    public void setAssinantes(Long assinantes) {
        assinantes = assinantes;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    @Override
    public String toString() {
        return "Plataforma{" +
                "nome='" + nome + '\'' +
                ", url='" + url + '\'' +
                ", mensalidade=" + mensalidade +
                ", status=" + status +
                ", assinantes=" + assinantes +
                ", filmes=" + filmes +
                '}';
    }
}
