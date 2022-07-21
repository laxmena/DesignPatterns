# Adapter Pattern Example: Ducks Turkeys

Note: This implementation is based on HeadFirst Design Pattern book. 

### Context
Let's Assume we are building a Game, where there are Ducks flying around. There can be different breeds of Ducks 
as part of the game, so all these individual concrete ducks implement the ["Duck Interface"](./src/com/laxmena/duck/Duck.java) 

We also have Turkeys as part of the game, and similarly they implement the ["Turkey Interface"](./src/com/laxmena/turkey/Turkey.java)

Assuming a scenario, where we are short of Ducks, and we come up with an idea where we can compensate for the unavailability of Ducks with 
Turkeys. But Turkey's dont implement the Duck interface. 
In order to overcome this situation, without making massive code changes, which could break existing system, we can make use of the Adapter patterns. 
We create an Adapter, which acts as a translator between two incompatible interfaces. We can make the Turkeys behave like Ducks.

#### Note: 
- Here we make use of "Object Adapter", where we implement the Adapter pattern using Object Composition.
- Class Adapter pattern cannot be implemented here, as Java doesn't support multiple inheritance.

### TurkeyAdapter

The Adapter Class Implementation - [TurkeyAdapter](./src/com/laxmena/duck/TurkeyAdapter.java). Using this adapter, We can use our Turkey, in place of a Duck. This is a One-way Adapter between the Duck and the Turkey.

Using this adapter, we can use our Turkey objects in Place of Ducks, and the Turkey's can understand and perform  the instructions given to it using the Duck Interface. This is accomplished by making the Duck Adapter implement the Duck interface.

Then a Turkey object is associated with this Adapter, and for each Duck methods, equivalent Turkey actions are  performed here.

