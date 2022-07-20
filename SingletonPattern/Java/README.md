# Singleton Design Pattern

## Defenition

Singleton is a Design Pattern that ensures that only one object of a Class can be instantitated. This patterns also makes sure that this Single object can be accessed globally.

## Implementation Steps

Following steps should be followed to make a Class, Singleton.

1. Make the Constructor of the class private.
    - This will ensure that this object cannot be instantiated outside this class.
2. Create a private static field store the Singleton instance.
3. Create a public static method - getInstance() which will return the Singleton instance.
    - This method checks if the instance is already initalized, if true, it returns the reference to the previously created instances.
    - If instance hasnt been initialized previously, this method initializes and returns reference to the newly created instance. 

## References and Examples

#### Singleton Reference/Template:

1. [Simple Singleton](./SingletonTemplate)
2. [Thread Safe Singleton](./SingletonTemplate)

#### Examples:

1. [ChocolateBoiler - HeadFirst DesignPatterns Example](./ChocolateBoiler)


## Things to note:
- Singleton Pattern violates the Single Responsibility principle (It creates an object, while also defines the functionality of the Class).
- Additional precautions are needed to implement Singletons in multithreaded environment to handle race problem and concurrency.
- Singleton desings can make it hard to figure out dependency chains in an application. (Read more: [Article](https://testing.googleblog.com/2008/08/by-miko-hevery-so-you-join-new-project.html))
