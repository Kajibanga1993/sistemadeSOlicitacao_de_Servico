package br.com.maddytec.cliente.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "TB_Servico")
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class Servico implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String nome;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_Endereco")
    private Endereco endereco;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_Solicitante")
    private Solicitante solicitante;

    public Servico() {
    }

    public Servico(long id, String nome, Endereco endereco, Solicitante solicitante) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.solicitante = solicitante;
    }

}
