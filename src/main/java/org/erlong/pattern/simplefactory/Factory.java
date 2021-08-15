package org.erlong.pattern.simplefactory;

import org.erlong.pattern.simplefactory.impl.ProductA;
import org.erlong.pattern.simplefactory.impl.ProductB;
import org.erlong.pattern.simplefactory.impl.ProductC;

/**
 * 工厂
 */
public class Factory {

    public static Product getProduct(int type) {
        if (type == 1) {
            return new ProductA();
        } else if (type == 2) {
            return new ProductB();
        } else {
            return new ProductC();
        }
    }
}
