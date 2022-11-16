package com.example.backendclase33PG.modelo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Escuela {
    @Id
    @SequenceGenerator(name = "escuela_sequence", sequenceName = "escuela_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "escuela_sequence")
    private Long id;
    private String nombre;
    private String direccion;
    @OneToMany(mappedBy = "escuela", fetch = FetchType.LAZY)
    private Set<Alumno> alumnos = new HashSet<>();

    public Escuela() {
    }

    public Escuela(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }
}