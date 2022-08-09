import java.util.*;
class Mythr extends Thread
{
    Mythr(String name)//pore oi name diye we can identfy the thread
    {
       super(name); 
    }
    public void run()
    {
        while(true)
        {
            System.out.println(this.getName());
        }
        /*while(true)
        {
        System.out.println("i am a thread");
        }*/
    }
}
public class multithread3  
{   public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in); 
    Mythr t1=new Mythr("SHUV ..................");
    Mythr t2=new Mythr("SHUV 2");
    Mythr t3=new Mythr("SHUV 3");
    Mythr t4=new Mythr("SHUV 4");
    Mythr t5=new Mythr("SHUV 5");
    /*System.out.println(t1.getName());
    System.out.println(t1.getId());
    System.out.println(t2.getName());
    System.out.println(t2.getId());*/
    t1.setPriority(Thread.MAX_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);
    t3.setPriority(Thread.MIN_PRIORITY);
    t4.setPriority(Thread.MIN_PRIORITY);
    t5.setPriority(Thread.MIN_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
  }
}