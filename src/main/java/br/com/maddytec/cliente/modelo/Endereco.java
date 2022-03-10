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

@Entity(name = "TB_Endereco")
@EqualsAndHashCode
@ToString
@Generated
@Setter
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_bairro")
    private Bairro bairro;
    private String tipoLocal;
    private String lougradouro;
    private int numero;
    private String complemento;

    public Endereco() {
    }

    public Endereco(Long id, Bairro bairro, String tipoLocal, String lougradouro, int numero,
            String complemento) {
        this.id = id;
        this.bairro = bairro;
        this.tipoLocal = tipoLocal;
        this.lougradouro = lougradouro;
        this.numero = numero;
        this.complemento = complemento;
    }

}
