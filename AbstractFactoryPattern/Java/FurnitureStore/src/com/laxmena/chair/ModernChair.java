package com.laxmena.chair;

public class ModernChair implements Chair {
    @Override
    public int legsCount() {
        return 0;
    }

    @Override
    public void sitOn() {
        System.out.println("Modern Chair with no legs! Occupied!");
    }
}
