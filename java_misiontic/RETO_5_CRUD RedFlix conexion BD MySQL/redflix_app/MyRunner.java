/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5.retflix183.redflix_app;

import reto5.retflix183.redflix_app.repository.PeliculaRepositorio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author UNIFORCE
 */
@Component
public class MyRunner implements CommandLineRunner {
    
    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private PeliculaRepositorio peliculaRepositorio;

    @Override
    public void run(String... args) throws Exception {
    

    }
}
