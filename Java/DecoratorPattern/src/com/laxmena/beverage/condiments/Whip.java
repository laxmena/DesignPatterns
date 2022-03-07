package com.laxmena.beverage.condiments;

import com.laxmena.beverage.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
