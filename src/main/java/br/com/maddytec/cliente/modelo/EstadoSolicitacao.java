package br.com.maddytec.cliente.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "TB_EstadoSolicitacao")
@EqualsAndHashCode
@ToString
@Generated
@Setter
public class EstadoSolicitacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String descricao;

    public EstadoSolicitacao() {
    }

    public EstadoSolicitacao(long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

}
