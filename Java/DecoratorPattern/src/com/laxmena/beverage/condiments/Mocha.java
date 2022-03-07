package com.laxmena.beverage.condiments;

import com.laxmena.beverage.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return this.beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }
}
