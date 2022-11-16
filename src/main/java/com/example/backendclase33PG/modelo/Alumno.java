package com.example.backendclase33PG.modelo;

import javax.persistence.*;

@Entity
@Table
public class Alumno {
    @Id
    @SequenceGenerator(name="alumno_sequence", sequenceName = "alumno_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    private Long id;
    private String nombre;
    private int edad;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="escuela_id")
    private Escuela escuela;

    public Alumno() {
    }

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

}
