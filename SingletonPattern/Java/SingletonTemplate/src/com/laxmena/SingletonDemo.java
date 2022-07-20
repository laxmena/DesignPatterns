package com.laxmena;

public class SingletonDemo {
    public static void main(String[] args) {
        // We call getInstance twice, but inspecting the system output we can observe the object is created only once.
        // Second time, the getInstance method returns the reference to the already created class.
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();
        // Note: This same technique might behave incorrectly when dealing with multiple threads.
        // Multithreading can cause getInstance method simultaneously,
        // thus creating multiple instance, defeating the purpose of Singleton.
        // Check Thread-Safe implementation of Singleton design pattern.
    }
}
