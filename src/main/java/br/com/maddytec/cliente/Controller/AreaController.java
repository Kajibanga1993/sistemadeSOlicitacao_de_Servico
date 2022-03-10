package br.com.maddytec.cliente.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maddytec.cliente.modelo.Area;
import br.com.maddytec.cliente.repositorio.AreaRepositorio;

@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    AreaRepositorio areaRepositorio;

    @PostMapping("/add")
    public void add(@RequestBody Area area) {
        areaRepositorio.save(area);

    }

    @GetMapping("/listar")
    public List<Area> listarAreas() {

        return areaRepositorio.findAll();
    }

    @DeleteMapping("/{id}")
    public void delectarArea(@PathVariable("id") Long id) {
        areaRepositorio.deleteById(id);

    }

}
