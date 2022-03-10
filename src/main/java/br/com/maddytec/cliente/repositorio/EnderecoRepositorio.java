package br.com.maddytec.cliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maddytec.cliente.modelo.Endereco;

public interface EnderecoRepositorio extends JpaRepository<Endereco, Long> {

}
