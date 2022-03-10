package br.com.maddytec.cliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maddytec.cliente.modelo.Cidade;

public interface CidadeRepositorio extends JpaRepository<Cidade, Long> {

}
