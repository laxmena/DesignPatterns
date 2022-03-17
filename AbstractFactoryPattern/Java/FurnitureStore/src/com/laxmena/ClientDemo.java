package com.laxmena;

import com.laxmena.chair.Chair;
import com.laxmena.factory.ArtDecoFurnitureFactory;
import com.laxmena.factory.FurnitureFactory;
import com.laxmena.factory.ModernFurnitureFactory;
import com.laxmena.factory.VictorianFurnitureFactory;
import com.laxmena.sofa.Sofa;
import com.laxmena.table.Table;

public class ClientDemo {

    public static void main(String[] args) {
        FurnitureFactory factory = null;

        System.out.println("Abstract Factory Demo\n\n");

	    // Client 1 requests for Victorian Furniture's - Chair and a Table
        System.out.println("User1 is Interested in Victorian Style");
        factory = new VictorianFurnitureFactory();
        Chair user1Chair = factory.createChair();
        Table user1Table = factory.createTable();
        user1Chair.sitOn();
        System.out.println("Weight capacity of User1 Table: " + user1Table.weightCapacity());

        // Client 2 requests for ArtDeco Furniture's
        System.out.println("\nUser2 is Interested in ArtDeco Style");
        factory = new ArtDecoFurnitureFactory();
        Sofa user2Sofa = factory.createSofa();
        Table user2Table = factory.createTable();
        System.out.println("Sofa material: " + user2Sofa.cushionType());
        System.out.println("Table weight capacity: " + user2Table.weightCapacity());

        // Client3 requests all furnitures in modern style
        System.out.println("\nUser3 is fond of Modern Style!");
        factory = new ModernFurnitureFactory();
        Chair user3chair = factory.createChair();
        Sofa user3sofa = factory.createSofa();
        Table user3table = factory.createTable();
        System.out.println("User3 Chair has legs?: legs count " + user3chair.legsCount());
        System.out.println("Sofa with cushion? " + user3sofa.hasCushion());
        System.out.println("Table material: " + user3table.material());

    }
}
