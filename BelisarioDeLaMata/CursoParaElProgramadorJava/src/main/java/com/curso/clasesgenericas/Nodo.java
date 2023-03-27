package com.curso.clasesgenericas;

/**
 * Esta clase al momento de ser instanciada debe definir el tipo de dato a trabajar
 * 
 */
public class Nodo<E> {
    private E valor;

    public E getValor() {
        return valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }
    
    
}
