# Decorator Pattern - Coffee Hut Example

Decorator pattern adds additional functionality to the existing classes. This pattern satisfies the Open-Close 
principle.

This example simulates a Coffee Shop. There can be numerous varieties of coffees that can be served to the customer. 
Each coffee has a basic ingredient(house blend, dark roast, espresso), and it is combined with different condiments(like steamed milk, whipped cream, 
mocha, soy, etc.).

It is not possible to create a new class for each variant of the Coffee. We can still go for that design, but there are two sideeffects.
1. Class Explosion
2. Open-Close Principle is not satisfied.

If there is a change in any one of the component, we need to make changes to all the dependent components. This is not a good practice in software development.

Here's where Decorators can be useful. Instead of creating new classes through Inheritance, we can decorate the classes with additional functionality.

Decorating a class is wrapping a class with another class, and it adds new functionality to the existing class. We extend the existing class with new behavior. Power of Decorators allows us to extend behaviors even during the runtime.

Important thing to note is, Decorator and the Wrapped class should be of same type(should extend the same super class). So, the decorator class can be passed around, instead of the wrapped class, and the system still works seamlessly.

## Classes, Interfaces and Descriptions

#### Beverage Class

This is the abstract super class based on which all other Coffee classes are designed. Beverage class contains abstract methods cost() and getDescription(). It also has a description attribute, that holds the description of the beverage.

Look at the source here: [Beverage](beverage/beverage.py)

#### DarkRoast, Decaf, Espresso, HouseBlend

These are all Concrete implementations of the Beverage class. These all represent different Coffees, with their own descriptions and price. The abstract methods are implemented in these classes.

Look at the classes here: [Beverage ConcreteClasses](beverage)

#### CondimentDecorator

This is an abstract class. CondimentDecorator also extends Beverage super class. All other Condiments are subclasses of this class.

This class has an attribute - beverage, which holds reference to the Beverage instance that it wraps. 

Note: This class extends Beverage class, so all other subclasses of this also belong to the type Beverage. So these classes can be used in place of other beverages as well.

Look at the source here: [CondimentsDecorator](beverage/condiments/condiments_decorator.py)

#### Mocha, Soy, Whip, SteamedMilk

These classes are concrete implementations of CondimentDecorator. These class defines the additional functionalities that we are trying to achieve. In this case, we add additional cost of the condiment to the beverage.

Look at the class implementations here: [condiments](beverage/condiments)

#### [coffee_hut.py](./coffee_hut.py)

Demo python file with main method, to see the Decorator pattern in action. Feel free to play around with this file to have better understanding of how the pattern works.

#### Output
```
House Blend Coffee $0.89
Espresso Coffee, Soy, Whip, Whip $2.3400000000000003
Dark Roast Coffee, Mocha, Mocha, Whip $1.49
```