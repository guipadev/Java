package com.dev.app.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dev.app.repositorys.IPeliculaRepository;

@Component
public class MyRunner implements CommandLineRunner {
    
    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private IPeliculaRepository peliculaRepository;

    @Override
    public void run(String... args) throws Exception {
    

    }
}
