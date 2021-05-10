package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name="film")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Filme {

    @Id
    @Column(name="film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="title", nullable = false)
    private String titulo;

    @Column(name="description", nullable = false)
    private String descricao;

    @Column(name="release_year")
    private int anoLancamento;

    @Column(name="rental_duration")
    private int duracaoAluguel;

    @Column(name="rental_rate")
    private double custoAluguel;

    @Column(name="length")
    private int duracao;

    @Column(name="replacement_cost")
    private double precoReposicao;

    @Column(name="rating")
    private String classificacao;

    @Column(name="special_features")
    private String conteudoEspecial;
}
