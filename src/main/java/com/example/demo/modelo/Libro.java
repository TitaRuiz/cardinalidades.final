package com.example.demo.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name ="libros")
public class Libro {
    @Id
    @Column(length = 20)
    private String ISBN;
    @Column(length = 60, nullable = false)
    private String titulo;
    @Column(length = 60, nullable = false)
    private String autor;
    private double precio;

   // @JsonIgnore
    @ManyToOne()
    @JoinColumn(name="id_editorial", nullable = false, foreignKey = @ForeignKey(name="FK_libros_editoriales"))
    private Editorial editorial;

}
