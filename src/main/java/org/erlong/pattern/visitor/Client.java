package org.erlong.pattern.visitor;

import org.erlong.pattern.visitor.impl.Order;
import org.erlong.pattern.visitor.impl.OrderVisitor;

import java.util.Date;

public class Client {

    public static void main(String[] args) {
        ObjectStructure obj = new ObjectStructure();
        obj.addElement(new Order(new Date(), "order-a"));
        obj.addElement(new Order(new Date(), "order-b"));
        obj.addElement(new Order(new Date(), "order-c"));
        Visitor visitor = new OrderVisitor();
        obj.accept(visitor);
    }
}
