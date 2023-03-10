package com.dev.app.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.app.models.Director;
import com.dev.app.models.Pelicula;

public interface IPeliculaRepository extends JpaRepository<Pelicula, Long> {

}