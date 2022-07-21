# Factory Method Pattern - DatabaseAdapter

Factory method pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate.
Method lets a class defer instantiation to subclasses. (Definition from HeadFirst Design Pattern).

Factory Method is a creational design pattern. Where the subclasses can alter the type of objects that are created. 
This allows flexibility to support future changes.

Some terms to note:
- Creators/Factories - Classes that create the Database objects.
- Product - Final products that are created by the creators.

## Classes, Interfaces and Description

### DatabaseFactory (Abstract Class)
This class declares the factory method - `createDatabase` that returns `Database` objects. It declares an abstract method, 
so the sub-classes should implement the concrete definition of the createDatabase methods.

### SQLFactory, NoSQLFactory (Concrete Creators/Factories)
These two classes are Concrete Factories that extend the base DatabaseFactory. These methods define the abstract methods
defined in the base class. The methods create and return a [Database](db/database.py) object.

Note: Database is an Interface, and all other Concrete Databases implement the Database Interface.

SQLFactory for now supports the creation of MySQL and Postgres database.

NoSQLFactory supports only the creation of MongoDB database.

### Database (Abstract Class for Product)

Database is an Interface, that defined the methods that all other Databases should implement.

### MongoDatabase, MySQLDatabase, PostgresDatabase (Concrete Products)

These classes are concrete implementations of the Database interface. They define the methods in the interface,
but they behave differently. This is a simulation, and to keep it simple, only print statements are implemented in the 
definitions.

-----
## Output
```
======== MongoDB ========
Querying Table: Table1 for fields user_name
Table Creation ==> NewTable
======== Postgres ========
PostgreSQL table creation: Postgres_Table

Try creating an unsupported Database
Requested Database not found
```

-----
#### Other useful resources 

- HeadFirst Design Patterns
- [Refactoring Guru - Factory Method Pattern](https://refactoring.guru/design-patterns/factory-method)