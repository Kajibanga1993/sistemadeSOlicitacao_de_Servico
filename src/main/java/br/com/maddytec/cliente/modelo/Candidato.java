package br.com.maddytec.cliente.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "TB_candidato")
@EqualsAndHashCode
@ToString
@Generated
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", length = 100)
    @NotEmpty(message = "{campo.nome.obrigatorio}")
    private String nome;

    @Column(name = "bilhete", length = 15)
    @NotEmpty(message = "{campo.bilhete.obrigatorio}")
    private String bilhete;
    private long email;

    @Column(name = "telefone", length = 100)
    private long telefone;

    @DateTimeFormat(pattern = "dd-mm-yyyy")
    private String dataNascimento;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_area")
    private Area area;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_provincia")
    private Provincia provincia;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    @JsonManagedReference
    @OneToOne
    private EstadoCandidatura situacao;

}
