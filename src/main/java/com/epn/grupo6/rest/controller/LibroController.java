package com.epn.grupo6.rest.controller;

import com.epn.grupo6.rest.entity.Libro;
import com.epn.grupo6.rest.model.DaoLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibroController {
    @Autowired
    private DaoLibro daoLibro;

    @GetMapping(value = "/libros")
    public List<Libro> holaMundo() {
        return daoLibro.findAll();
    }

    @PostMapping(value = "/guardarLibro")
    public String guardarLibro(@RequestBody Libro libro) {
        daoLibro.save(libro);
        return "Libro guardado";
    }

    @PutMapping(value="/actualizarLibro/{id}")
    public String actualizarLibro(@PathVariable long id, @RequestBody Libro libro){
        Libro libroActualizado = daoLibro.findById(id).get();
        libroActualizado.setNombre(libro.getNombre());
        libroActualizado.setNumeroPaginas(libro.getNumeroPaginas());
        daoLibro.save(libroActualizado);
        return "Libro actualizado";
}
    @DeleteMapping(value = "eliminarLibro/{id}")
    public String eliminarLibro(@PathVariable long id){
        Libro libroBorrado = daoLibro.findById(id).get();
        daoLibro.delete(libroBorrado);
        return "Libro borrado";
    }
}
