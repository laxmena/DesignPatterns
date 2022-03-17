package com.laxmena.factory;

import com.laxmena.chair.Chair;
import com.laxmena.sofa.Sofa;
import com.laxmena.table.Table;

public interface FurnitureFactory {
    public Chair createChair();
    public Sofa createSofa();
    public Table createTable();
}
