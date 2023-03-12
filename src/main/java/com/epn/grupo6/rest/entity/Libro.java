package com.epn.grupo6.rest.entity;

import jakarta.persistence.*;

@Entity
public class Libro {
    // Atributo 1
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    // Atributo 2
    @Column
    private String nombre;
    // Atributo 3
    @Column
    private int numeroPaginas;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
