package com.laxmena.factory;

import com.laxmena.chair.Chair;
import com.laxmena.chair.ModernChair;
import com.laxmena.sofa.ModernSofa;
import com.laxmena.sofa.Sofa;
import com.laxmena.table.ModernTable;
import com.laxmena.table.Table;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
