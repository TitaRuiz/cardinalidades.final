package com.example.demo.servicio;

import com.example.demo.dto.LibroDto;
import com.example.demo.dto.LibroEditorialDto;
import com.example.demo.modelo.Libro;
import com.example.demo.repositorio.ILibroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibroServicioImpl implements ILibroServicio{
    @Autowired
    private ILibroRepo repo;

    @Override
    public List<Libro> ejemploJoin() {

        return repo.obtenerLibrosEditorial();
    }

    @Override
    public List<LibroDto> usarDto() {
        return  repo.usarDTO();
    }

    @Override
    public List<LibroEditorialDto> usarDtoJoin(String id) {
        return repo.usarDtoJoin(id);
    }
}
