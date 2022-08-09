import java.util.*;
class ex1 extends Thread
{
    public void run()
    {
        while(true)
        {
            try
            {
                Thread.sleep(200);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }            
        System.out.println("GOOD MORNING......");
        }
    }
}
class ex2 extends Thread
{
   public void run()
   {
       while(true)
       {
            try
            {
                Thread.sleep(200);
            }
            catch(Exception e)
            {
                System.out.println(e);
            } 
        System.out.println("GOOD NIGHT");
       }
   } 
}
public class threadex 
{   public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in); 
    ex1 t1=new ex1();
    ex2 t2=new ex2();
    t1.start();
    t2.start();
  }
}