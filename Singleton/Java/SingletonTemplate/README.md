# Singleton Implementation - Template and Reference

There are two straight implementations of Singleton Design Patterns.

1. Naive Singleton
2. Thread Safe Singleton

### Naive Singleton - Implementations

This approach is suitable for not very complex applications. This approach doesn't behave as intended, in a 
multithreaded scenario, where multiple threads attempt to create instances for the singleton object. 

- Singleton Class: [Singleton.java](./src/com/laxmena/Singleton.java)
- Demo Class: [SingletonDemo.java](./src/com/laxmena/SingletonDemo.java)

### Thread Safe Singleton - Implementation

This approach is more suitable in a multithreaded environment. Double-Checked Locking technique is implemented to check 
for race conditions when multiple threads attempt to get the instance of the Singleton object. 

- Singleton Class: [ThreadSafeSingleton.java](./src/com/laxmena/ThreadSafeSingleton.java)
- Demo Class: [ThreadSafeSingletonDemo.java](./src/com/laxmena/ThreadSafeSingletonDemo.java)

#### References:

- Synchronized in Java: https://docs.oracle.com/javase/tutorial/essential/concurrency/syncmeth.html
- Volatile in Java: https://www.geeksforgeeks.org/volatile-keyword-in-java/
- Double-Checked Locking: https://en.wikipedia.org/wiki/Double-checked_locking