import java.util.*;
class runnable1 implements Runnable
{
    int i=0;
    public void run()
    {
       while(i<100)
       {
       System.out.println("....OOOOOOO....."); 
       i++;
       }
    }
}

class runnable2 implements Runnable
{
    int i=0;
    public void run()
    {
        while(i<100)
       {
       System.out.println("......IIIII......"); 
       i++;
       }
    }
}
public class multithread2
{   public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in); 
    runnable1 bullet1=new runnable1(); 
    Thread gun1=new Thread(bullet1);
    runnable2 bullet2=new runnable2();
    Thread gun2=new Thread(bullet2);
    
    gun1.start();
    gun2.start();
  }
}