package com.mitocode.java11;

import com.mitocode.java11.opts.Demo;
import com.mitocode.java11.opts.Persona;

public class App {   

    public static void main(String[] args) {

        Demo d = new Demo();
        //Persona per = new Persona(1, "MitoCode");
        //Persona per = new Persona();
        Persona per = null;
        d.estaVacio(per);
        d.estaPresente(per); 
    }
}
