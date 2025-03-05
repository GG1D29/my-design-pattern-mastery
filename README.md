# GoF Design Patterns

## Creational 
0. [Definition](#C0-Creational-Design-Pattern)
1. [Builder](#C1-Builder-Pattern)
2. [Singleton](#C2-Singleton-Pattern)
3. [Prototype](#C3-Prototype-Pattern)
4. [Factory](#C4-Factory-Pattern)
5. [Abstract Factory](#C5-Abstract-Factory-Pattern)

## Behavioral
0. [Definition](#B0-Behavioral-Design-Pattern)
1. [Chain of Responsibility](#B1-Chain-of-Responsibility)
2. [Command](#B2-Command-Pattern)
3. [Iterator](#B3-Iterator-Pattern)
4. [Mediator](#B4-Mediator-Pattern)
5. [Memento](#B5-Memento-Pattern)
6. [Observer](#B6-Observer-Pattern)

## Structural
0. [Definition](#S0-Structural-Design-Pattern)
1. [Adapter](#S1-Adapter-Pattern)
2. [Bridge](#S2-Bridge-Pattern)
3. [Composite](#S3-Composite-Pattern)
4. [Decorator](#S4-Decorator-Pattern)
5. [Facade](#S5-Facade-Pattern)
6. [Proxy](#S6-Proxy-Pattern)

### C0. Creational Design Pattern
- Set of design patterns to help manage the complexity of creating an object.
- Encapsulate the knowledge about which concrete class should be used.
- Conceal how objects are created and put together.

### C1. Builder Pattern
- Avoid passing a lot of params to the constructor
- There's mandatory fields, and also optional ones.
- Naming convention: ClassNameBuilder, e.q PersonBuilder
- Created as [static inner class](https://stackoverflow.com/a/31579424) 
- Has `build()` method that actually return the real constructed object.

### Useful Tips or Improvement:
- Can set the constructor to private
- Can pass in the Builder object instead of the many args.
```java
    private person(PersonBuilder personBuilder) {
        // Set each field here.
    }
```
---

### C2. Singleton Pattern
- There is one static/class variable named `INSTANCE`
- Set the class constructor to private
- Provide public static method `getInstance()`
```java
    public static Logger getInstance() {
        return INSTANCE;
    }
```

### Useful Tips or Improvement:
- Set the class to be `final` so that it cannot be extended.
- Concern when using Singleton -> Thread safety
- Recommended approach to implement the Singleton is to use enum class
- It is recommended to use Enums with single `INSTANCE`
- Enums in Java are guaranteed to always be thread-safe.
- Enums guarantee that only one instance of the object exists.
- The methods inside the class _still need_ to handle the thread safety properly.

---

### C3. Prototype Pattern
- The main objective of this pattern is to eliminate code duplication when creating new instances with same parameters.
- Using the copy constructor technique
- It simplifies object creation by allowing the copying of existing object configurations without complicating the class hierarchy.

### Useful Tips or Improvement:
- Define the abstract method `clone()` in the abstract/parent class.
- Implement the `clone()` method in the child class.
- Use deep cloning to ensure that each cloned object has its own separate instances of _mutable fields_.

---

### C4. Factory Pattern
- A class whose sole purpose is to handle creation of another class
- This class does not know in advance what the concrete type of that class should be.
- A nice side effect of this pattern is that the creation of the object is encapsulated in one place so if it changes the call to new is only in that one place and only need to be changed there.

---

### C5. Abstract Factory Pattern
- Handles groups of related classes e.q User Interface (buttons, toolbar, scroll bar)
- The system should be independent of how objects are created
- It should be configured with one of the multiple families of objects
- The family of related objects should be used together.
- Complex class hierarchy
- Concrete classes are hidden from the client

---

### B0. Behavioral Design Pattern
- The design pattern that focus on how objects assign responsibilities between each other.
- Concern with how objects are connected, communicate with each other.
- Some focus on Class and some focus on Object.
- Class behavioral pattern use `inheritance` to share behavior between different classes.
- Object behavioral pattern looks at how objects can work together to get things done.
- Some object pattern focus on encapsulating behavior in a single object and delegating requests to it.

---

### B1. Chain of Responsibility
- Decouple the sender of a request from the receiver of the request.
- Create a successor chain that for chaining together the next class that will handle the request.


### B2. Command Pattern
- It's a way of making requests when you don't know anything about what exactly is being requested
- The request is encapsulated inside _an object_
- Useful for commands that you might want to perform later.

### B3. Iterator Pattern
- This pattern provides a way to access the elements of an aggregate object(Collection) sequentially without exposing its underlying representation.
- Design Principle → Encapsulate what varies.
- The iterator pattern helps us encapsulate the iteration.
- For example: Iterator interface in Java Collection allows data to be accessed, removed, or stored in a collection.

### B4. Mediator Pattern
- An object that encapsulates how a set of objects interact. 
- Mediator promotes loose coupling by keeping objects from referring to each other explicitly

### B5. Memento Pattern
- Definition: Capture and externalize object's internal state so that the object can be restored to this state later, without breaking the principle of encapsulation.
- Similar to Undo or Ctrl+Z command
- Tips: Use deep copy technique to copy the content of previous state to avoid restoring the old reference of the object

### B6. Observer Pattern
- Define one to many dependency among objects so that when one object changes state, all its dependencies will be notified and updated accordingly.
- One implementation is called the Publish-Subscribe
- We can make the use of the PropertyChangeListener and PropertyChangeSupport classes which are the part of the JDK.
- Observable is also called the `Subject`(the one), in this example the User class.
- Meanwhile, the Observers are also called the `Dependent` or Subscriber(the many), in this case the Newsfeed class.

### Useful Tips or Implementation Steps:
- First step:
- Implement `PropertyChangeListener` to the `Observer` class(Newsfeed)
- Override the `propertyChanged(ProperyChangeEvent evt)` method from the interface -> this method will receive event from the Subject(user)
```java
public class Newsfeed implements PropertyChangeListener {
    //...

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        statuses.add((String)evt.getNewValue());        
    }
}
```
- Second step:
- Add `PropertyChangeSupport` field to the `Observable` class -> this variable will notify the Observers when a property in this class changes.
- Call the method `firePropertyChange(propName, oldValue, newValue)` to notify the changes to the Observer
- Add the method to `addPropertyChangeListener(NewsFeed)`
```java
import java.beans.PropertyChangeSupport;

public class User {
    private String status;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void setStatus(String status) {
        support.firePropertyChange("status", "oldValue", "newValue");
        this.status = status;
    }

    // To put it all together: this method must be called by the Driver class/method.
    public void addPropertyChangeListener(Newsfeed newsfeed) {
        support.addPropertyChangeListener(newsfeed);
    }
}
```
- If `oldValue` and `newValue` are the same, this method will not do anything.
- Finally, add the method in the Driver class/method to addPropertyChangeListener()
```java
public static void main(String[] args) {
    //...
    user1.addPropertyChangeListener(newsfeed);
    user1.addPropertyChangeListener(newsfeed);
    
    user1.setStatus("...");
    user2.setStatus("...");
    //...
}
```
---

### S0. Structural Design Pattern
- How classes and objects are put together to form larger structure.
- The more larger objects/classes the more complex it becomes to handle, that's where these Design patterns come in.
- Two main of focus in Structural Design pattern: `Class Patterns`, and `Object Patterns`.
- _Structural Class Patterns_ are concerned with the "is a" relationship. → `Inheritance`
- _Structural Object Patterns_ are concerned with the "has a" relationship. → `Composition`

### S1. Adapter Pattern
- Allows classes to work together when they normally wouldn't be able to. (Imagine the US vs EU socket plug)
- This pattern is typically used when working with existing/legacy code.
- There are two versions: Object adapter and Class adapter pattern (Object version is more common in Java) 
- The Class Version relies on multiple inheritance → in Java this can be achieved through the use of Interfaces
- If we want to override the behavior of the Adaptee class, it might be better to use the Class Adapter pattern.
- The drawback of Class Adapter pattern is the Adapter can only work with the specific type of Adaptee (the extended class) 
---

### S2. Bridge Pattern
- Official definition: Decouple an abstraction from its implementation so that the two can vary independently.
- It means separate the part of our system that represents abstraction from the part that implements it, so that one can vary without affecting the other.
- Use Composition instead of Inheritance, e.q `Shape` has a `Color`
- Use this pattern to maintain flexibility in a Class Hierarchy.
- To avoid having created multiple class in the hierarchy.
- How to achieve: Use composition to pass in the configuration to the different classes.

---

### S3. Composite Pattern
- Allow us to treat objects and groups of object in the same way e.q Checklist and To-do item list.
- The client using the composite can ignore the differences between the composite and its parts. (because it is implementing same interface)

---

### S4. Decorator Pattern
- Change behavior of an object without creating a new subclass for that behavior.
- How to achieve: Create a Decorator class that implements the same interface as the main class.

---

### S5. Facade Pattern
- Provides unified interface to a set of interfaces in the subsystem.
- Provides a simple interface for a complex subsystem. 
- Encapsulates all access to a subsystem.

---

### S6. Proxy Pattern
- Proxy is a class that controls access to the functionality of another class.
- Proxy use cases: Create expensive objects on demand, Control access to an object
---

This repo is inspired by the Challenges on LinkedIn Learning Course called: 

[Complete Guide to Java Design Patterns: Creational, Behavioral, and Structural](https://www.linkedin.com/learning/complete-guide-to-java-design-patterns-creational-behavioral-and-structural/)
