package com.laxmena;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());
        threadOne.start();
        threadTwo.start();
    }

    static class ThreadOne implements Runnable {
        @Override
        public void run() {
            ChocolateBoiler boiler = ChocolateBoiler.getInstance("DarkChocolate");
            System.out.println(boiler.name);
        }
    }

    static class ThreadTwo implements Runnable {
        @Override
        public void run() {
            ChocolateBoiler boiler = ChocolateBoiler.getInstance("Rasins");
            System.out.println(boiler.name);
        }
    }
}
