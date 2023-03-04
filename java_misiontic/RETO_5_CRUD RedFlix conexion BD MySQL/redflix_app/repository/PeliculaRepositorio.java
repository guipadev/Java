/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.retflix183.redflix_app.repository;

import reto5.retflix183.redflix_app.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author UNIFORCE
 */
@Repository
public interface PeliculaRepositorio extends JpaRepository<Pelicula, Long> {    
}
