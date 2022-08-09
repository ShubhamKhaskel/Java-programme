import java.util.*;
class Mythread1 extends Thread
{
    public void run()
    {
        while(true)
        {
        System.out.println("My thread 1 is running");
        System.out.println("GOOD");
        }
    }
}
class Mythread2 extends Thread
{
    public void anything()
    {
        while(true)
        {
        System.out.println("My thread 2 is running");
        System.out.println("SAD");
        }
    }
}
public class multithread1  
{   public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in); 
    Mythread1 t1=new Mythread1();
    Mythread2 t2=new Mythread2();
    t1.start();
    t2.start();
  }
}