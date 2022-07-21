package com.laxmena;

public class ThreadSafeSingletonDemo {

    public static void main(String[] args) {
        // Create two threads, each of which will try and attempt to create a new instance of the Singleton.
        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());

        threadOne.start();
        threadTwo.start();

        // Inspecting the output produced when executing this method, we can observe that the Singleton is created only
        // once by the thread that first calls it. So there are no two instances created, each by the two threads,
        // which would normally be the case going by the method without the threadsafe mechanism.
    }

    // Defining two threads, where both the threads make use of getInstance method.
    private static class ThreadOne implements Runnable {
        private String creator = "Thread1";

        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance(creator);
            singleton.printCreator();
        }
    }

    private static class ThreadTwo implements Runnable {
        private String creator = "Thread2";

        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance(creator);
            singleton.printCreator();
        }
    }

}
