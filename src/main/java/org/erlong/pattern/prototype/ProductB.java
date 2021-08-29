package org.erlong.pattern.prototype;

public class ProductB implements Product{
    @Override
    public Product cloneProduct() {
        return new ProductB();
    }
}
