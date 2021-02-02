package chronos.filmoteca;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Filme {
    private String nome;
    private double duration;
    private String faixaEtaria;

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duration=" + duration +
                ", faixaEtaria='" + faixaEtaria + '\'' +
                '}';
    }
}
