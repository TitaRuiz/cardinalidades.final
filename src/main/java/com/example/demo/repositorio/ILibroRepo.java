package com.example.demo.repositorio;

import com.example.demo.dto.LibroDto;
import com.example.demo.dto.LibroEditorialDto;
import com.example.demo.modelo.Libro;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ILibroRepo extends JpaRepository<Libro,String> {

    @Query("SELECT l FROM Libro l JOIN FETCH l.editorial")
    List<Libro> obtenerLibrosEditorial();

    @Query("SELECT new  com.example.demo.dto.LibroDto(l.ISBN, l.titulo) FROM Libro l")
    List<LibroDto> usarDTO();
    @Query("SELECT new com.example.demo.dto.LibroEditorialDto(l.ISBN, l.titulo, l.editorial.nombreEditorial, l.editorial.dirección)" +
            " FROM Libro l JOIN  l.editorial WHERE l.editorial.nombreEditorial LIKE :id%")
    List<LibroEditorialDto> usarDtoJoin(@Value("id") String id);



}
