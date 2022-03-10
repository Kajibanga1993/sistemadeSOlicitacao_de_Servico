package br.com.maddytec.cliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maddytec.cliente.modelo.Solicitante;

public interface SolicitanteRepositorio extends JpaRepository<Solicitante, Long> {

}
