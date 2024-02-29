package com.example.demo.controlador;

import com.example.demo.dto.LibroDto;
import com.example.demo.dto.LibroEditorialDto;
import com.example.demo.modelo.Libro;
import com.example.demo.servicio.ILibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/libros")
public class LibroControlador {
   @Autowired
    private ILibroServicio servicio;

   @GetMapping
    public List<Libro> obtenerJoin(){
       return servicio.ejemploJoin();
   }
   @GetMapping("/dto")
   public List<LibroDto> obtenerDto(){
       return servicio.usarDto();
   }
   @GetMapping("/dtojoin/{id}")
   public List<LibroEditorialDto> obtenerDtoJoin(@PathVariable(name="id") String id){
       return servicio.usarDtoJoin(id);
   }
}
