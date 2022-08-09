import java.util.*;
abstract class Vehicle
{
    int f;
    abstract void fare();
    void display()
    {
       System.out.println(f); 
    }
}
class Taxi extends Vehicle
{
    void fare()
    {
       f=100;
       System.out.println("Taxi fare-->"); 
    }
}
class Bus extends Vehicle
{
    void fare()
    {
       f=20;
       System.out.println("Bus fare-->"); 
    }
}
public class abstractprac1
{
    public static void main(String args[])
    {
        Vehicle ob1=new Taxi();
        Vehicle ob2=new Bus();
        ob1.fare();
        ob1.display();
        ob2.fare();
        ob2.display();
    }
}
