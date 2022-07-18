package com.laxmena;

public class ChocolateBoiler {
    public String name;
    private boolean empty;
    private boolean boiled;

    private static volatile ChocolateBoiler instance;

    private ChocolateBoiler(String name) {
        this.name = name;
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(String name) {
        // Double Checked Locking
        ChocolateBoiler result = instance;
        if(result != null) {
            return result;
        }
        synchronized (ChocolateBoiler.class) {
            if(instance == null) {
                instance = new ChocolateBoiler(name);
            }
            return instance;
        }
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
