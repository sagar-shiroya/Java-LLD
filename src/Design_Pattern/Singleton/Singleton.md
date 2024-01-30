# Singleton Design Pattern (One and Only one)
- It is **creational** design pattern.
- Creational Design Pattern mainly provides different mechanisms of object creation.


## Why Singleton Design Pattern?
- Some classes are used to store resource or configuration like DBConnection etc.
- In the case of the connections, application can create as many connections as many users accessing it.
- So at some point of time, it gets out of limitation available to use.
- Whoever comes next won't be able to create object of it.
- Solution is to create single instance and make it available to all the threads/users.

## Singleton Pattern Principles
- It ensures that there's only one instance of a class that exists in JVM.
- It mainly used for logging, configuration, driver objects, caching etc.
- It must provide global access to get instance of the class.

## Singleton Pattern Implementation
1. We have to restrict object creation from outside. - *Make Constructor Private*
```java
private Singleton(){
    
}
```
2. Constructor should be only accessed by another method of the same class. This method can be invoked without creating object of the class. - *Make getInstance() public and static*
```java
public static Singleton getInstance(){
    
}
```
3. We have to check whether an instance of class created or not in this method:
- Create static private attribute of type class
```java
private static Singleton instance;
```
- If instance is null then create an object and assigned it to this static attribute and return it
- Else return already created instance
```java
public static Singleton getInstance(){
    if(instance == null){
        instance = new Singleton();
    }
    return instance;
}
```
4. If we want to make thread safe then we can use synchronized keyword and at the same time multiple threads comes when object has not created then we can restrict to enter if block one by one.

5. **Double-check locking method** is the solution of above problem:
```java
public static Singleton getInstance(){
    if(instance == null){
        synchronized (Singleton.class){
            if(instance == null){
                instance = new Singleton();
            }
        }
    }
    return instance;
}
```