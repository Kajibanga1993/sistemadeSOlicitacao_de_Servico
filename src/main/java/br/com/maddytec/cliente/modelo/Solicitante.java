package br.com.maddytec.cliente.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.Setter;
import lombok.ToString;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "TB_Solicitante")
@EqualsAndHashCode
@ToString
@Generated
@Setter
public class Solicitante implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_EstadoSolicitacao")
    private EstadoSolicitacao estadoDa_Solcitante;

    private String nome;
    private String telefone;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_provincia")
    private Provincia provincia;

    public Solicitante() {
    }

    public Solicitante(long id, Endereco endereco, EstadoSolicitacao estadoDa_Solcitante, String nome, String telefone,
            Provincia provincia) {
        this.id = id;
        this.endereco = endereco;
        this.estadoDa_Solcitante = estadoDa_Solcitante;
        this.nome = nome;
        this.telefone = telefone;
        this.provincia = provincia;
    }

}
