package com.example.main;

import com.example.api.Expression;
import com.example.impl.AddExpression;
import com.example.impl.NumberExpression;
import com.example.impl.SubtractExpression;

public class Main {

	public static void main(String[] args) {
		// Construir una expresión aritmética: 1 +
		Expression expression = new SubtractExpression(
				new AddExpression(new NumberExpression(2), new NumberExpression(2)), new NumberExpression(3));

		// Evaluar la expresión
		int result = expression.interpret();

		System.out.println("Resultado de la  expresión: " + result);

	}

}
