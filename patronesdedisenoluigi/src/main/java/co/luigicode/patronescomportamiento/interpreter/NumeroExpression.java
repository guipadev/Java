package co.luigicode.patronescomportamiento.interpreter;

import java.util.Stack;

/**
 * Va añadiendo uno encima del otro, como una pila de platos
 */
public class NumeroExpression implements Expression {

    private int numero;

    public NumeroExpression(int numero) {
        this.numero = numero;
    }

    @Override
    public void interpret(Stack<Integer> stack) {
        stack.push(numero);
    }
}
