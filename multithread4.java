import java.util.*;
class Mythr extends Thread
{
    Mythr(String name)//pore oi name diye we can identfy the thread
    {
       super(name); 
    }
    public void run()
    {
        for(int i=0;i<20;i++)
        {
            System.out.println(this.getName());
        }
        /*while(true)
        {
        System.out.println("i am a thread");
        }*/
    }
}
public class multithread4  
{   public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in); 
    Mythr t1=new Mythr("SHUV ..................");
    Mythr t2=new Mythr("SHUV 2");
    /*System.out.println(t1.getName());
    System.out.println(t1.getId());
    System.out.println(t2.getName());
    System.out.println(t2.getId());*/
    t1.start();
    try
    {
        t1.join();         //t1 completes then it catches t2
    }
    catch(Exception e)
    {
        System.out.println(e); //t2 starts after t1 is completed
    }
    t2.start();
  }
}