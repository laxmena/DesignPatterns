package com.laxmena;

public class Singleton {
    private static Singleton instance;

    // Private constructor, which makes initializing an object of this Class only from within.
    private Singleton() {
        System.out.println("Creating Singleton Object");
    }


    public static Singleton getInstance() {
        if(instance == null) {
            // Lazy Initialization
            instance = new Singleton();
        }
        return instance;
    }

}
