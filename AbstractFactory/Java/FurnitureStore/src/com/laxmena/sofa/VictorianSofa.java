package com.laxmena.sofa;

public class VictorianSofa implements Sofa {
    @Override
    public boolean hasCushion() {
        return true;
    }

    @Override
    public String cushionType() {
        return "Royal Victorian Cushion";
    }
}
