package org.erlong.pattern.visitor.impl;

import org.erlong.pattern.visitor.Element;
import org.erlong.pattern.visitor.Visitor;

public class OrderVisitor implements Visitor {
    @Override
    public void visit(Element e) {
        System.out.print(e.getName() + ": ");
        System.out.println(e.getCreateTime());
    }
}
