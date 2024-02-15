package com.example.impl;

import com.example.api.Expression;

public class AddExpression implements Expression {
	private Expression left;
	private Expression right;

	public AddExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public int interpret() {
		return left.interpret() + right.interpret();
	}
}
