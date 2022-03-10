package br.com.maddytec.cliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maddytec.cliente.modelo.EstadoSolicitacao;

public interface EstadoSolicitacaoRepositorio extends JpaRepository<EstadoSolicitacao, Long> {

}
