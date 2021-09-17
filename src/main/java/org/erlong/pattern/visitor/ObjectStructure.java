package org.erlong.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Element> list = new ArrayList<>();

    public void addElement(Element e) {
        this.list.add(e);
    }

    public void accept(Visitor visitor) {
        list.forEach(e -> e.accept(visitor));
    }
}
