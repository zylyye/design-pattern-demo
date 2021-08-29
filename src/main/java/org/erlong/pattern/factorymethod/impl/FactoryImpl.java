package org.erlong.pattern.factorymethod.impl;

import org.erlong.pattern.factorymethod.Factory;
import org.erlong.pattern.factorymethod.Product;

/**
 * 工厂方法的实现类
 */
public class FactoryImpl extends Factory {

    /**
     * 子类实现具体的创建产品示例的方法
     */
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
