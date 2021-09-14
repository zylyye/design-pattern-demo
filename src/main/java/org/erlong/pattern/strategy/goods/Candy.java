package org.erlong.pattern.strategy.goods;

import org.erlong.pattern.strategy.Costable;

public class Candy implements Costable {

    @Override
    public double cost(int num) {
        return 1.5 * num;
    }
}
