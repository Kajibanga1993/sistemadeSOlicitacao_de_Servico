package br.com.maddytec.cliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maddytec.cliente.modelo.Servico;

public interface ServicoRepositorio extends JpaRepository<Servico, Long> {

}
