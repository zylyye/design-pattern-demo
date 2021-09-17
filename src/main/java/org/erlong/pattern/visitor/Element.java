package org.erlong.pattern.visitor;

import java.util.Date;

public interface Element {

    Date getCreateTime();

    String getName();

    void accept(Visitor visitor);
}
