package org.erlong.pattern.interpreter.nonterminalExpression;

import org.erlong.pattern.interpreter.Context;
import org.erlong.pattern.interpreter.Expression;

public class Divide implements Expression {

    private Expression left;

    private Expression right;

    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpret(Context context) {
        return left.interpret(context) / right.interpret(context);
    }
}
