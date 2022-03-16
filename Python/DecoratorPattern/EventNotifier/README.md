# Decorator Pattern - Notifier Example

Decorator Pattern is used to simulate a Notification system. The user can opt in for multiple notification channels like 
SMS, Slack and Facebook along with the default Email notification channel. 

Instead of creating classes for each combination of notification channels, Decorator pattern is used here to achieve
the combination of notification mediums.

## Classes, Interfaces and Descriptions

### Abstract Class: Notifier

This is the abstract class, which the decorator and the concrete class extends. 

File: [notifier.py](notifier/notifier.py)

### Concrete Class: EmailNotifier

This is the default notification medium in this program. This class extends the Notifier abstract class, and implements 
the send method. 

File: [email_notifier.py](notifier/email_notifier.py)

### Decorator Abstract Class: BaseDecorator

This is the Decorator abstract class, which extends Notifier. All other decorators should extend and implement the 
methods defined abstract in this class.

File: [decorator.py](notifier/decorator.py)

### Concrete Decorators: SlackDecorator, FacebookDecorator, SMSDecorator

SlackDecorator, FacebookDecorator and SMSDecorator are concrete classes, that implements the Abstract Decorator BaseClass.

These decorators wrap another notifier, and add their functionality to the wrapped notifier. All these decorators also 
implement the send() method where they add their own functionality to the existing workflow, thus easily extending the 
behavior without much of a change in the code.

Files: [slack_notifier.py](notifier/slack_notifier.py), [sms_notifier.py](notifier/sms_notifier.py), [fb_notifier](notifier/fb_notifier.py)

## Output of client_demo.py

```
Sending Email Notification: Hello world!
Sending Slack Notification: Hello world!

Sending Email Notification: Sending email + fb + slack notification
Sending Slack Notification: Sending email + fb + slack notification
Sending Facebook Notification: Sending email + fb + slack notification

Sending Email Notification: SMS + Email
Sending SMS Notification: SMS + Email
```

-----

## Resources
- [Refactoring Guru - Decorator Pattern](https://refactoring.guru/design-patterns/decorator)
- HeadFirst Design Patterns Second Edition