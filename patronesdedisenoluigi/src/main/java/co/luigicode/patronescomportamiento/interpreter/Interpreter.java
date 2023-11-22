package co.luigicode.patronescomportamiento.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Interpreter {

    private List<Expression> list = new ArrayList<>();

    public Interpreter(String str) {
        for (String token : str.split(" ")) {
            if (token.equals("+"))
                list.add(new SumarExpression());
            else if (token.equals("-"))
                list.add(new DisminuirExpression());
            else if (token.equals("*"))
                list.add(new MultiplicaExpression());
            else if (token.equals("/"))
                list.add(new DivisionExpression());
            else
                list.add(new NumeroExpression(Integer.valueOf(token)));
        }
    }

    public int evaluate() {
        Stack<Integer> stack = new Stack<>();

        for (Expression e : list)
            e.interpret(stack);

        return stack.pop();
    }
}
