package org.erlong.pattern.interpreter.terminalExpression;

import org.erlong.pattern.interpreter.Context;
import org.erlong.pattern.interpreter.Expression;

import java.math.BigDecimal;

public class Constant implements Expression {
    String varName;

    public Constant(String varName) {
        this.varName = varName;
    }

    @Override
    public double interpret(Context context) {
        new BigDecimal(1);
        return context.get(varName);
    }
}
