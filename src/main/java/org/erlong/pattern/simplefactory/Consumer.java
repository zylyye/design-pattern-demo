package org.erlong.pattern.simplefactory;

/**
 * 消费者
 */
public class Consumer {

    private Product product;

    public void initProduct() {
        this.product = Factory.getProduct(1);
    }
}
