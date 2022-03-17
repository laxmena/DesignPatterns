package com.laxmena.chair;

public class VictorianChair implements Chair {

    @Override
    public int legsCount() {
        return 4;
    }

    @Override
    public void sitOn() {
        System.out.println("Victorian Chair is occupied");
    }
}
