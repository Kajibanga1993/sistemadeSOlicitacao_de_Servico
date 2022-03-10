package br.com.maddytec.cliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maddytec.cliente.modelo.Provincia;

public interface ProvinciaRepositorio extends JpaRepository<Provincia, Long> {

}
