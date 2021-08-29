package org.erlong.pattern.prototype;

public class ProductA implements Product{
    @Override
    public Product cloneProduct() {
        return new ProductA();
    }
}
