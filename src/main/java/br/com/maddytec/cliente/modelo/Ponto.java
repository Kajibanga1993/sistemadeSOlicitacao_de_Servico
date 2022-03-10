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
import lombok.Generated;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "TB_Ponto")
@EqualsAndHashCode
@ToString
@Generated
@Setter
public class Ponto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_Endereco")
    private Endereco endereco;

    public Ponto() {
    }

    public Ponto(Long id, Endereco endereco) {
        this.id = id;
        this.endereco = endereco;
    }

}
