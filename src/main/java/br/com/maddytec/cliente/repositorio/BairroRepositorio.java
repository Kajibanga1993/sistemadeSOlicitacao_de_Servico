package br.com.maddytec.cliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maddytec.cliente.modelo.Bairro;

public interface BairroRepositorio extends JpaRepository<Bairro, Long> {

}
