package com.example.demo.servicio;

import com.example.demo.modelo.Editorial;

import java.util.List;

public interface IEditorialServicio {

    Editorial crear(Editorial e);
    Editorial modificar(Editorial e);

    void eliminar(int id);

    Editorial consultarUno(int id);
    List<Editorial> consultarTodos();

}
