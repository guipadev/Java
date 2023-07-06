package com.charlycimino.prueba.ejSOLID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Atletismo implements DeporteSinBalon {

    public Atletismo() {
    }

    @Override
    public void realizarActividad() {
        System.out.println("Realizando actividad de atletismo");
    }
}