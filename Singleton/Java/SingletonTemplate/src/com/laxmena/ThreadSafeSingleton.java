package com.laxmena;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;
    private String creator;

    private ThreadSafeSingleton(String creator) {
        // Initialization logic
        System.out.println("Creating Thread Safe Singleton Object");
        this.creator = creator;
    }

    public static ThreadSafeSingleton getInstance(String creator) {
        // Double-Checked Locking technique is used here to prevent race conditions in a multithreaded environment.
        // Where multiple threads might try and create an instance.

        try {
            // Including an artificial delay to observe how the multi-threading performs.
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        ThreadSafeSingleton singletonObj = instance;
        if(singletonObj != null) {
            return singletonObj;
        }

        // Use Synchronized to work with multithreaded operations
        synchronized (ThreadSafeSingleton.class) {
            if(instance == null) {
                // Lazy Initialization
                instance = new ThreadSafeSingleton(creator);
            }
            return instance;
        }
    }

    public void printCreator() {
        System.out.println("Thread created by: " + this.creator);
    }

}
