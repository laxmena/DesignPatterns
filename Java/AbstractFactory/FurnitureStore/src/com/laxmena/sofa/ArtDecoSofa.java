package com.laxmena.sofa;

public class ArtDecoSofa implements Sofa {
    @Override
    public boolean hasCushion() {
        return true;
    }

    @Override
    public String cushionType() {
        return "High Resilient Foam";
    }
}
