# Singleton Pattern - Chocolate Boiler

This is an implementation of the ChocalteBoiler Example provided in the HeadFirst Design Patterns book.

### Singleton Pattern: Definition 

The Singleton pattern ensures a class has only one instance, and provides a global point of access to it.

### Classes and Descriptions

__ChocolateBoiler__

This class has a Private instructor, which means that this class cannot be instantiated from outside. 
Object for this class can be initiated only from within the class.

So, we define a static method in this class. This static method checks if there is already an object instatiated,
if true, then this method returns a reference to the created instance. If the object is not previously created, then 
a new object instance is created and the reference is returned.

### References and Reading materials

This implementation uses `volatile`, `synchronized` and `double checking locking` approaches. Find reading materials related to these topics here:

#### Java volatile keyword
- https://jenkov.com/tutorials/java-concurrency/volatile.html
- https://www.baeldung.com/java-volatile

#### Synchronized

#### Double Checking Locking
