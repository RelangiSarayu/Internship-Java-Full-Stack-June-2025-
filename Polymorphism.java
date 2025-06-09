import java.util.*;
class Example
{
public void add(int a,int b)
{
int c=a+b;
System.out.println(c);
}
public void add(int a,int b,int c)
{
int d=a+b+c;
System.out.println(d);
}
}

class Polymorphism
{
public static void main(String[] args)
{
System.out.println("This is the main class");
Example obj=new Example();
obj.add(2,3);
obj.add(2,3,4);
}
}

