# Observer Pattern - News Publisher & Subscriber

A Digital News Agency and Subscriber has been designed to demonstrate the Observer pattern. Whenever there is a new news added to the NewsAgency(The Publisher/Observable), all its subscribers are notified.

There are two techniques in Observer Pattern
1. Push model
2. Pull model

### Push Model

Whenever there is an update in the Publisher, it pushes the data automatically to all its subscribers. This can be useful in some scenarios, but can be very resource consuming in other scenarios. 
Understanding the pros and cons, and the requirements of our system is very important when deciding which mechanism to opt for.

Push model works really well for Notification systems. Very similar to Android and Apple Mobile Notifications. But in other cases, subscriber might be performing a different task, and this push data can cause some unintended consequences.

### Pull Model

Pull model is a technique where, the Publisher doesn't push the updated data to the subscriber directly. But rather notifies it, and the subscriber can pull the changes whenever it is ready, so other processes are not interrupted.

This project implements pull model. Where the Publisher doesn't send News data everytime to the client, but rather sends a notification, and client pulls the data from the Publisher.

## Classes, Interfaces and Descriptions

#### NewsSubscriber and NewsPublisher Interface

These two are the primary interfaces that are used to implement the Observer Design Pattern. All Publishers should implement the NewsPublisher interface, and all consumers/subscribers should implement NewsSubscriber interface.

Files: [NewsSubscriber.java](src/com/laxmena/NewsSubscriber.java), [NewsPublisher.java](src/com/laxmena/NewsPublisher.java)

#### Concrete NewsPublisher Classes

- NewsAgency.java - Abstract Parent Class of all other NewsAgency classes.

*Classes that extends NewsAgency:*
- EngineeringNewsAgency.java
- DesignNewsAgency.java

these classes are concrete implementations of the NewsPublisher Interface. These classes also provide interface to add news to the agency. These classes implements singleton design pattern.

#### Concrete NewsSubscriber Class

For this example we only create one Subscriber class.

- EngineeringNewsReader.java

This is a subscriber that only subscribes to EngineeringNewsAgency(Hardcoded). Once subscribed, this reader will start receiving updates from the publisher class. 

On reception of a notification, it automatically pulls the latest data from the Publisher. 
Have a look at the implementation to get a better understanding: [EngineeringNewsReader](src/com/laxmena/EngineeringNewsReader.java)

Note:
The implementations are more straight forward to demonstrate the implementation of the pattern. Project is not completely optimized for flexibility. Which will be updated in the future.

## Output
```
------------
Published by: Engineering News | Published on: 2022-03-05T15:48:01.691748305
Title: Sample News Title
Content: Here goes some content
------------
------------
Published by: Engineering News | Published on: 2022-03-05T15:48:01.705883371
Title: Heres another news title
Content: and some more content
------------
------------
Published by: Engineering News | Published on: 2022-03-05T15:48:01.706003498
Title: Interesting titile?
Content: and interestign news article content here!!
------------

Process finished with exit code 0

```