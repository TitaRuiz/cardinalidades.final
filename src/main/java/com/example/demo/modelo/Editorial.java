package com.example.demo.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="editoriales")
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEditorial;
    @Column(length = 30, nullable = false)
    private String nombreEditorial;
    @Column(length = 30, nullable = false)
    private String dirección;


//    @OneToMany(mappedBy = "editorial", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    public List<Libro> libros;

}
