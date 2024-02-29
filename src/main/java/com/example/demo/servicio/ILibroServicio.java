package com.example.demo.servicio;

import com.example.demo.dto.LibroDto;
import com.example.demo.dto.LibroEditorialDto;
import com.example.demo.modelo.Libro;

import java.util.List;

public interface ILibroServicio {

    List<Libro> ejemploJoin();

    List<LibroDto> usarDto();

    List<LibroEditorialDto> usarDtoJoin(String id);
}
