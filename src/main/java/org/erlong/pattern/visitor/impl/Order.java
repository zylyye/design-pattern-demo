package org.erlong.pattern.visitor.impl;

import org.erlong.pattern.visitor.Element;
import org.erlong.pattern.visitor.Visitor;

import java.util.Date;

public class Order implements Element {

    private Date createTime;

    private String name;

    public Order(Date createTime, String name) {
        this.createTime = createTime;
        this.name = name;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public String getName() {
        return name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
