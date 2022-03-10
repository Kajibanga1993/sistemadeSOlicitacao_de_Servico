package br.com.maddytec.cliente.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "TB_EstadoCandidatura")
@EqualsAndHashCode
@ToString
@Generated
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EstadoCandidatura implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String descricao;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_candidato")
    private Candidato candidato;

}
