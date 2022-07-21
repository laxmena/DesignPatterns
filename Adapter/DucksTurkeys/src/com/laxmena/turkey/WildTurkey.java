package com.laxmena.turkey;

public class WildTurkey implements Turkey {
    // Concrete Turkey Object
    @Override
    public void gobble() {
        System.out.println("Gobble gobble!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a Short distance ");
    }
}
