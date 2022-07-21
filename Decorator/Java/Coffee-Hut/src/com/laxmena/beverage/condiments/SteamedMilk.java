package com.laxmena.beverage.condiments;

import com.laxmena.beverage.Beverage;

public class SteamedMilk extends CondimentDecorator {
    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Steamed Milk";
    }
}
