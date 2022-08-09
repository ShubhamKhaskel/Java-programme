import java.util.*;
class abc
{
   private int a;  
   abc(int x)
   {
       a=x;
   }
   int geta()
   {
       return a;
   }
}
class xyz extends abc
{
    private int b;
    xyz(int x,int y)
   {
       super(x);
       b=y;
   }
   int getb()
   {
       return b;
   }
   public int calculate()
   {
       return (geta()+b);
   }
}
class pqr extends xyz
{
   private int c;
   pqr(int x,int y,int z)
   {
       super(x,y);
       c=z;
   }
   public int calculate()
   {
       return (super.calculate()+c);
   }
   public void display()
   {
       System.out.println(calculate());
   }
}
public class inher3
{
    public static void main(String args[])
    {
        pqr ob=new pqr(3,4,5);
        ob.display();
    }
}