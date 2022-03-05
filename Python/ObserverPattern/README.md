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

Note: Interfaces are implemented in Python by using Abstract methods

Files: [news_subscriber.py](interface/news_subscriber.py), [news_publisher.py](interface/news_publisher.pys)

#### Concrete NewsPublisher Classes

- [NewsAgency](NewsAgency/news_agency.py) - Abstract Parent Class of all other NewsAgency classes.

*Classes that extends NewsAgency:*
- [EngineeringNewsAgency](NewsAgency/engineering_news_agency.py)

these classes are concrete implementations of the NewsPublisher Interface. These classes also provide interface to add news to the agency. These classes implement singleton design pattern.

#### Concrete NewsSubscriber Class

For this example we only create one Subscriber class.

- [EngineeringNewsReader](NewsReader/engineering_news_reader.py)

This is a subscriber that only subscribes to EngineeringNewsAgency(Hardcoded). Once subscribed, this reader will start receiving updates from the publisher class. 

On reception of a notification, it automatically pulls the latest data from the Publisher.

Note:
The implementations are more straight forward to demonstrate the implementation of the pattern. Project is not completely optimized for flexibility. Which will be updated in the future.

## Output
```
News alert for Reader:  Reader1
--------------
Published by: Engineering News Agency | Date: 03/05/2022, 17:15:36
Title: Test title
Content: Python Engineering content
--------------
News alert for Reader:  Reader1
--------------
Published by: Engineering News Agency | Date: 03/05/2022, 17:15:36
Title: Yet another title
Content: Random content
--------------
News alert for Reader:  Reader1
--------------
Published by: Engineering News Agency | Date: 03/05/2022, 17:15:36
Title: Another user added!
Content: News should print twice with the user name
--------------
News alert for Reader:  AnotherReader
--------------
Published by: Engineering News Agency | Date: 03/05/2022, 17:15:36
Title: Another user added!
Content: News should print twice with the user name
--------------

Process finished with exit code 0
```

### Explanation

- Initially there is just one Subscriber for the NewsAgency. 
- After the first two news article, a new subscriber subscribes to the NewsAgency.
- So when the third news article is published, notifications are sent to both the subscribers, and we see the news content printed twice in the out.

