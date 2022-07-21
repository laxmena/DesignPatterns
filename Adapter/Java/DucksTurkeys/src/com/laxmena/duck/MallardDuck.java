package com.laxmena.duck;

public class MallardDuck implements Duck {
    // Concrete Implementation of the Duck Interface
    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("Flying Duck!");
    }
}
