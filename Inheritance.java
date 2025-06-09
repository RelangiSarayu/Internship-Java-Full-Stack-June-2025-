import java.util.*;

class Animal{
public void sound()
{
System.out.println("I am Animal");
}
}
class Dog extends Animal
{
public void bark()
{
System.out.println("I am dog");
}
}
class Inheritance
{
public static void main(String[] args)
{
System.out.println("This is main class");
Animal obj1=new Animal();
obj1.sound();
Dog obj2=new Dog();
obj2.bark();
}
}

