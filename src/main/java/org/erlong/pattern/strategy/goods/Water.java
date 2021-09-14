package org.erlong.pattern.strategy.goods;

import org.erlong.pattern.strategy.Costable;

public class Water implements Costable {

    @Override
    public double cost(int num) {
        return 2.5 * num;
    }
}
