import java.util.*;
//interfaces should be implimented all the function should be defined
interface Bicycle
{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Hornnn
{
    void method1();
    void method2();
}
class Hero implements Bicycle,Hornnn
{
   void blowHorn()
   {
       System.out.println("........Pee Pee.........");
   }
   public void applyBrake(int decrement)
   {
       System.out.println("Applying Brake");
   }
   public void speedUp(int increment)
   {
       System.out.println("Applying speedUp");
   }
   public void method1()
   {
       System.out.println("**********");
   }
   public void method2()
   {
       System.out.println("..........");
   }
}
public class Interfaces{ 
    public static void main(String args[])
    {
        Hero ob=new Hero();
        ob.applyBrake(1);
        System.out.println(ob.a);
    }
}