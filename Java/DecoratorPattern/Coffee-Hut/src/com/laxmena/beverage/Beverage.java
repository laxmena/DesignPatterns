package com.laxmena.beverage;

/**
 * Beverage Abstract Class.
 *
 * Other Concrete Beverage classes like Dark Roast, Latte, and Expresso
 * extend this base class.
 */
public abstract class Beverage {
    String description = "Some Beverage!";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
