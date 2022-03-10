package br.com.maddytec.cliente.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "TB_Provincia")
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class Provincia implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Provincia() {
    }

    public Provincia(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

}
