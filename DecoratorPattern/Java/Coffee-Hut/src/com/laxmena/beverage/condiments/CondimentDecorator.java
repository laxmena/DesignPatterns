package com.laxmena.beverage.condiments;

import com.laxmena.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
