package br.com.maddytec.cliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maddytec.cliente.modelo.EstadoCandidatura;

public interface EstadoCandidaturaRepositorio extends JpaRepository<EstadoCandidatura, Long> {

}
