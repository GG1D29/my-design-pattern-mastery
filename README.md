# GoF Design Patterns

## Creational 
1. [Builder](#C1-Builder-Pattern)
2. [Singleton](#C2-Singleton-Pattern)
3. [Prototype](#C3-Prototype-Pattern)

## Behavioral

## Structural

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

### C2. Singleton Pattern
- There is one static/class variable called `INSTANCE`
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

### C3. Prototype Pattern
- The main objective of this pattern is to eliminate code duplication when creating new instances with same parameters.
- Using the copy constructor technique
- It simplifies object creation by allowing the copying of existing object configurations without complicating the class hierarchy.

### Useful Tips or Improvement:
- Define the abstract method `clone()` in the abstract/parent class.
- Implement the `clone()` method in the child class.
- Use deep cloning to ensure that each cloned object has its own separate instances of _mutable fields_.

---


_This repo is inspired by the Exercise/Challenges on LinkedIn Learning Course:_

https://www.linkedin.com/learning/complete-guide-to-java-design-patterns-creational-behavioral-and-structural/improve-your-code-with-design-patterns
