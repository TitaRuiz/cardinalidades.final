package com.example.demo.repositorio;

import com.example.demo.modelo.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEditorialRepo extends JpaRepository<Editorial,Integer> {
}
