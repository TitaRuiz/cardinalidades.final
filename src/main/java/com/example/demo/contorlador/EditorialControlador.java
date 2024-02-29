package com.example.demo.contorlador;

import com.example.demo.modelo.Editorial;
import com.example.demo.servicio.IEditorialServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoriales")
public class EditorialControlador {
    @Autowired
    private IEditorialServicio editorialServicio;
    @PostMapping
    public Editorial crear(@RequestBody Editorial e) {
        return editorialServicio.crear(e);
    }

    @PutMapping
    public Editorial modificar(@RequestBody Editorial e) {
        return editorialServicio.modificar(e);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable(name="id") int id) {
        editorialServicio.eliminar(id);
    }

    @GetMapping("/{id}")
    public Editorial consultarUno(@PathVariable(name="id")int id) {
        return editorialServicio.consultarUno(id);
    }


    @GetMapping
    public List<Editorial> consultarTodos() {
        return editorialServicio.consultarTodos();
    }
}
