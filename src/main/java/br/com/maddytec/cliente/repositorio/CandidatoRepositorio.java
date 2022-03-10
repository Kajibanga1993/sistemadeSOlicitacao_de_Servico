package br.com.maddytec.cliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maddytec.cliente.modelo.Candidato;

public interface CandidatoRepositorio extends JpaRepository<Candidato, Long> {

}
