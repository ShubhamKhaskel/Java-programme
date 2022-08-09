import java.util.*;//find whether the arry is sorted or not
class prob1
{
    /*static void prob(int n)
    {
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.format("%d X %d=%d\n",n,i,i*n);
        }
    }
    public static void main(String args[])
    {
       prob(7); 
    }
    
    ......................
    
    
    static void multi(int n)
    {
       int i,j;
       for(i=1;i<=n;i++)
       {
           for(j=1;j<=i;j++)
           {
              System.out.format("*"); 
           }
           System.out.print("\n");
       }
    }
    public static void main(String args[])
    {
      multi(5);
    }
    
    .................
    
    
    static int recur(int n)
    {
      if(n==1)
      {
          return 1;
      }
      else
      {
      return n+recur(n-1);
      }
    }
    public static void main(String args[])
    {
        int s=recur(10);
        System.out.println("Sum="+s);
    }
    
    ...................
    
    
    static void multi(int n)
    {
       int i,j;
       for(i=n;i>=1;i--)
       {
           for(j=1;j<=i;j++)
           {
              System.out.format("*"); 
           }
           System.out.print("\n");
       }
    }
    public static void main(String args[])
    {
      multi(5);
    }*/
    
    static int fibo(int n)
    {
       int i,a=0,b=1,c;
       if(n==1||n==2)
       {
           return n-1;
       }
       else
       {
         return fibo(n-1)+fibo(n-2); 
       }
       
    }
    public static void main(String args[])
    {
      int s=fibo(5);
      System.out.format("%d",s);
    }
}