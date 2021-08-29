package org.erlong.pattern.prototype;

public class Consumer {

    public void handleProduct(Product p) {
        // 复制产品，但无需知道产品类型，因为产品使用了原型模式
        Product product = p.cloneProduct();
        // to do with product
    }

}
