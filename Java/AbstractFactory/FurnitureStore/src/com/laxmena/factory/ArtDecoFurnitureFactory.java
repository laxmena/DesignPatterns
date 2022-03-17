package com.laxmena.factory;

import com.laxmena.chair.ArtDecoChair;
import com.laxmena.chair.Chair;
import com.laxmena.sofa.ArtDecoSofa;
import com.laxmena.sofa.Sofa;
import com.laxmena.table.ArtDecoTable;
import com.laxmena.table.Table;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public Table createTable() {
        return new ArtDecoTable();
    }
}
