# Decorator Pattern - Notifier Example

Decorator Pattern is used to simulate a Notification system. The user can opt in for multiple notification channels like 
SMS, Slack and Facebook along with the default Email notification channel. 

Instead of creating classes for each combination of notification channels, Decorator pattern is used here to achieve
the combination of notification mediums.

## Classes, Interfaces and Descriptions

### Abstract Class: Notifier.java

This is the abstract class, which the decorator and the concrete class extends. 

### Concrete Class: EmailNotifier

This is the default notification medium in this program. This class extends the Notifier abstract class, and implements 
the send method. 

### Decorator Abstract Class: BaseDecorator

This is the Decorator abstract class, which extends Notifier. All other decorators should extend and implement the 
methods defined abstract in this class.

### Concrete Decorators: SlackDecorator, FacebookDecorator, SMSDecorator

SlackDecorator, FacebookDecorator and SMSDecorator are concrete classes, that implements the Abstract Decorator BaseClass.

These decorators wrap another notifier, and add their functionality to the wrapped notifier. All these decorators also 
implement the send() method where they add their own functionality to the existing workflow, thus easily extending the 
behavior without much of a change in the code.

## Sample Output

```
Default Notification: Email Notification
Message: SMS Slack and Email Notification!
Slack Notification
Message: SMS Slack and Email Notification!
SMS Message 
 Message: SMS Slack and Email Notification!
 
Default Notification: Email Notification
Message: This is the second combination of notifier!
Slack Notification
Message: This is the second combination of notifier!
Facebook Notification
 Message: This is the second combination of notifier!
```