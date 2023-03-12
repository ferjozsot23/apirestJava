package com.epn.grupo6.rest.model;

import com.epn.grupo6.rest.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaLibro extends JpaRepository<Libro, Long> {
}
