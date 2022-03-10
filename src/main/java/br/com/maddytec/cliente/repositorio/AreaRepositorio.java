package br.com.maddytec.cliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maddytec.cliente.modelo.Area;

public interface AreaRepositorio extends JpaRepository<Area, Long> {

}
