package org.erlong.pattern.strategy;

import org.erlong.pattern.strategy.goods.Candy;
import org.erlong.pattern.strategy.goods.Water;

public class Client {

    public static void main(String[] args) {
        // 水和糖果的价格算法分别由各自的类确定，售货机 Seller 只负责调用
        Seller candySeller = new Seller(new Candy());
        Seller waterSeller = new Seller(new Water());

        double candyCost = candySeller.buy(10);
        double waterCost = waterSeller.buy(20);
    }
}
