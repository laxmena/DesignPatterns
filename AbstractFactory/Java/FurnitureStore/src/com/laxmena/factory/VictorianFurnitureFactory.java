package com.laxmena.factory;

import com.laxmena.chair.Chair;
import com.laxmena.chair.VictorianChair;
import com.laxmena.sofa.Sofa;
import com.laxmena.sofa.VictorianSofa;
import com.laxmena.table.Table;
import com.laxmena.table.VictorialTable;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorialTable();
    }
}
