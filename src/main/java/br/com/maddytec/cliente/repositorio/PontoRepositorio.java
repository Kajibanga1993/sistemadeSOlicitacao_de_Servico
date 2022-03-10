package br.com.maddytec.cliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maddytec.cliente.modelo.Ponto;

public interface PontoRepositorio extends JpaRepository<Ponto, Long> {

}
