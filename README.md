# Design Patterns #

## Singleton ##
- A creational design pattern which ensures a class has only one instance and 
a global access point to the instance.
- Make the default constructor private to prevent other from creating new instance.
- Create a static creation method that acts as a constructor. This method will call the 
private constructor to create an object and save it in a static field and return it in all following calls.
  
*Applicability*
- when a class in your program should have just a single instance available to all clients; 
  for example, a single database object shared by different parts of the program. 
- when you need stricter control over global variables. Unlike global variables, the Singleton pattern guarantees
  that there’s just one instance of a class. Nothing, except for the Singleton class itself, can replace the cached instance.

![Alt text](./images/singleton.png?raw=true "title")

![Alt text](./images/singletoncd.png?raw=true "title")

References:
- https://refactoring.guru/design-patterns/singleton
- https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples

## Factory ##
- another creational design pattern that provides an interface for creating objects in a superclass but allows
  subclasses to alter the type of objects that will be created.
- is used when we have a superclass and multiple sub-classes and based on input we need to return one of the sub-class.
  
*Applicability*
- when we don't know beforehand the exact type and dependencies of the objects the code should work with.
- when we want to provide a way to extend the internal components. For instance, in existing payment methods, we want to
  allow extending the payment through other process in future.
- when you want to save system resources by reusing existing objects instead of rebuilding them each time.

![Alt text](./images/factory_design_pattern.png?raw=true "title")

References:
- https://www.journaldev.com/1392/factory-design-pattern-in-java
- https://refactoring.guru/design-patterns/factory-method
- https://www.sourcecodeexamples.net/2017/12/factory-design-pattern.html

## Abstract Factory ##
- A creational design pattern that lets you produce families of related objects without specifying their concrete classes.

## Builder ##
- design pattern that lets you construct complex objects step by step. It allows to produce different types and 
  representation of an object using same construction code.
- it can be used when and object has a lot of attributes.

*Applicability*
- Use the Builder pattern to get rid of a “telescopic constructor”. When we have ten or more optional parameters, it 
  is inconvenient to create a constructor with all those parameters. Instead, with overload constructor and 
  create several constructors with few parameters. Builder pattern allows to build objets step by step using the
  parameters that we only need. It removes the necessity of creating multiple constructors with different parameters.
- Use it when you want to create different representations of some product.

![Alt text](./images/builder.png?raw=true "builder")

References:
- https://refactoring.guru/design-patterns/builder

## Prototype ##
- Design pattern that lets you copy existing objects without making the code dependent on their classes.
- Used when creation of object directly is costly.
- For instance, an object to be created after a costly database operation. The object can be cached and return its clone 
on next request.

![Alt text](./images/prototype.png?raw=true "prototype")

References:
- [Prototype](https://refactoring.guru/design-patterns/prototype)

## Object Pool ##

When objects are expensive to create, and they are needed only for short periods of time it is advantageous to utilize 
the Object Pool pattern. The Object Pool provides a cache for instantiated objects tracking which ones are in use 
and which are available.

Object pool pattern is a software creational design pattern which is used in situations where the cost of initializing 
a class instance is very high.
Basically, an Object pool is a container which contains some amount of objects. So, when an object is taken from 
the pool, it is not available in the pool until it is put back.

![Alt text](./images/Object_pool.png?raw=true "object_pool")

References:
- https://www.sourcecodeexamples.net/2018/05/object-pool-design-pattern.html
- https://sourcemaking.com/design_patterns/object_pool

## Proxy  ##

Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy
controls the access to the original object, allowing to perform something either before or after the request gets through
to the original object.

Proxies delegate all of the real work to some other object. Each proxy method should, in the end,
refer to a service object unless the proxy is a subclass of a service.

For heavy Java object like JDBC connection, or a SessionFactory that requires some initial configuration, we only want
them to be initialized on demand. And once they are initialized, we want to reuse them for all calls.

![Alt text](./images/proxy.jpg?raw=true "title")

*When to Use*
- *When we want a simplified version of a complex or heavy object*.
  In this case, we may represent it with a skeleton object which loads the original object on demand, also called as
  lazy initialization. This is known as the Virtual Proxy.

- *When the original object is present in different address space, and we want to represent it locally*. We can create
  a proxy which does all the necessary boilerplate stuff like creating and maintaining the connection, encoding,
  decoding, etc., while the client accesses it as it was present in their local address space.
  This is called the Remote Proxy.

- *When we want to add a layer of security to the original underlying object to provide controlled access based on
  access rights of the client*. This is called Protection Proxy.

Reference:
- [The Proxy Pattern in Java](https://www.baeldung.com/java-proxy-pattern#proxy-pattern-example)
- [Proxy in Java](https://refactoring.guru/design-patterns/proxy/java/example#:~:text=Proxy%20is%20a%20structural%20design,object%20used%20by%20a%20client.&text=The%20proxy%20object%20has%20the,when%20passed%20to%20a%20client.)
- [Proxy](https://refactoring.guru/design-patterns/proxy)
  
  

