# Abstract Factory Pattern - Furniture Store

Abstract Factory Pattern is implemented here with an example of a Furniture Store.

We consider three different styles of furniture - Victorian, Modern and ArtDeco. Also, There are three furniture products in each style - Table, Chair and Sofa. Which essentially adds upto 9 products, and should be flexible to expand.

There are multiple families(styles) of related products(furnitures), and this is exactly the place where Abstract Factory can be very effective.

Since there are three different styles in this example, we would need 3 different factories. Victorian Factory will 
produce products that adhere to the Victorian Style. Similarly, for other styles factory creates products that follow its
style. So we will need **3 Different Factory methods**.

All these three different factory methods will implement a common **FurnitureFactory interface**. 

Similarly, each product will implement an interface. 
Eg: Concrete classes of Chairs(Victorian, Modern and ArtDeco) will all implement a base **Chair Interface**. 

## Classes Interfaces and Descriptions

### Abstract Factory Interface
[FurnitureFactory](src/com/laxmena/factory/FurnitureFactory.java) is the Abstract Factory class, that defines the common 
methods that all Concrete Factory classes should implement. 

### Concrete Factory Classes
- ArtDecoFurnitureFactory
- ModernFurnitureFactory
- VictorianFurnitureFactory

These three classes implement the Abstract Factory class. They define the methods createChair, createTable and createSofa.
These factory methods takes care of creating the appropriate products for that style.

### Abstract Product Interface
- [Chair](src/com/laxmena/chair/Chair.java)
- [Table](src/com/laxmena/table/Table.java)
- [Sofa](src/com/laxmena/sofa/Sofa.java)

These three are product interfaces, that define the methods that the concrete implementation should define. 

### Concrete Product Classes

VictorianChair, VictorianTable, VictorianSofa, ArtDecoChair, ArtDecoTable, ArtDecoSofa, ModernTable, ModernChair, 
ModernSofa are the concrete implementations of the above-mentioned abstract interfaces. 


## From Clients View

From Clients perspective, client does not have to know about the concrete classes and implementations. As long as the 
client knows that the object implements the interface, the client can consume the methods defined in the interface.

So, a question arises who initializes the appropriate concrete factory object. This is usually done during the 
initialization of the project where the suitable Factory class object is instantiated based on the arguments or the 
environment variables.

This is a very powerful creational design pattern that allows flexibility, and adheres the Single Responsibility Principle.
This also enables loose coupling in the code.

## Output of ClientDemo
```cmd
Abstract Factory Demo

User1 is Interested in Victorian Style
Victorian Chair is occupied
Weight capacity of User1 Table: 20.0

User2 is Interested in ArtDeco Style
Sofa material: High Resilient Foam
Table weight capacity: 30.0

User3 is fond of Modern Style!
User3 Chair has legs?: legs count 0
Sofa with cushion? false
Table material: Resin + Hard Plastic
```