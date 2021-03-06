# DesignPatterns
Implementation of various design patterns in C++, Java and Python.

This is an Open Source project created to serve as a Reference material. If you find this repository useful, do star the repository to show your support.

---
## Strategy Pattern

**Description:** Strategy Pattern in implemented in a primitive VideoStreaming service, that automatically changes Streaming Strategy in run-time based on network speed of the client.

- [Java Implementation](StrategyPattern/Java/VideoStreamingService)
- [Python Implementation](StrategyPattern/Python/VideoStreamingService)

----
## Observer Pattern

**Description:** A Digital News Agency and Subscriber has been designed to demonstrate the Observer pattern. Whenever there is a new news added to the NewsAgency(The Publisher/Observable), all its subscribers are notified.

- [Java Implementation](ObserverPattern/Java/NewsAgency)
- [Python Implementation](ObserverPattern/Python/NewsAgency)

----
## Decorator Pattern

**Description:** Decorator pattern adds additional functionality to the existing classes. This pattern satisfies the Open-Close principle.

#### Coffee-Hut Example
**Example Description:** This example implements the Decorator Pattern to simulate a Coffee Shop billing system, where the users can customize the coffee with condiments in infinite possibilities. 

- [Java Implementation](DecoratorPattern/Java/Coffee-Hut)
- [Python Implementation](DecoratorPattern/Python/Coffee-Hut)

#### Notification Channels Example: 
Decorator Pattern is used to simulate a Notification system. The user can opt in for combination of multiple notification channels like SMS, Slack and Facebook along with the default Email notification channel. 

- [Java Implementation](DecoratorPattern/Java/EventNotifier)
- [Python Implementation](DecoratorPattern/Python/EventNotifier)
----

## Factory Method Pattern

**Description:**

#### Database Adapter Example

**Example Description:** Simple Database Adapter - implements Factory method. Makes use of Two Factories - one for SQL and another for NoSQL that helps create different Databases, and perform queries on them.

- [Java Implementation](FactoryPattern/Java/DatabaseAdapter)
- [Python Implementation](FactoryPattern/Python/DatabaseAdapter)

----

## Abstract Factory Pattern

**Description:**
Abstract Factory is a creational design pattern that lets us produce families of related objects without specifying their concrete classes. [Definition Source](https://refactoring.guru/design-patterns/abstract-factory).
#### Furniture Store Example

**Example Description:** 
Abstract Factory Pattern is implemented here with an example of a Furniture Store. We consider three different styles of furniture - Victorian, Modern and ArtDeco. Also, There are three furniture products in each style - Table, Chair and Sofa. Which essentially adds upto 9 products, and should be flexible to expand. Abstract Factory is implemented to approach this challenge.

- [Java Implementation](AbstractFactoryPattern/Java/FurnitureStore)
- [Python Implementation](AbstractFactoryPattern/Python/FurnitureStore)

----

If you have any feedbacks, comments or suggestions regarding this repository, please do let me know!

You can contact me through [Email](mailto:ConnectWith@laxmena.com), [LinkedIn](https://www.linkedin.com/in/lakshmanan-meiyappan) or [Twitter](https://twitter.com/laxmena)

I write Tech blogs and articles here: [Medium](https://laxmena.medium.com) and [Personal Blog](https://laxmena.com)!
