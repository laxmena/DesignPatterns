package com.laxmena.chair;

public class ArtDecoChair implements Chair {
    @Override
    public int legsCount() {
        return 4;
    }

    @Override
    public void sitOn() {
        System.out.println("Someone is sitting on the Art Deco Chair!");
    }
}
