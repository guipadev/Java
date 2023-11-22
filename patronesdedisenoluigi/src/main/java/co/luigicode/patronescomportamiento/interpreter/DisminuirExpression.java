package co.luigicode.patronescomportamiento.interpreter;

import java.util.Stack;

/**
 * Va eliminando desde el último en la pila
 */
public class DisminuirExpression implements Expression {
    @Override
    public void interpret(Stack<Integer> stack) {
        int aux = stack.pop();
        stack.push(stack.pop() - aux);
    }
}
