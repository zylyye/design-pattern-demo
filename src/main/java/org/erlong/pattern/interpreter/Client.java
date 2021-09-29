package org.erlong.pattern.interpreter;

import org.erlong.pattern.interpreter.nonterminalExpression.Add;
import org.erlong.pattern.interpreter.nonterminalExpression.Multiply;
import org.erlong.pattern.interpreter.nonterminalExpression.Subtract;
import org.erlong.pattern.interpreter.terminalExpression.Constant;

public class Client {

    public static void main(String[] args) {
        // 构建表达式 (x + y) * (x - y) 解释器
        Constant x = new Constant("x");
        Constant y = new Constant("y");
        Multiply exp = new Multiply(new Add(x, y), new Subtract(x, y));
        Context context = new Context();
        context.add("x", 15D);
        context.add("y", 10D);
        // 计算：(15 + 10) * (15 - 10)
        double res = exp.interpret(context);
        System.out.println("(15 + 10) * (15 - 10) = " + res);
    }
}
