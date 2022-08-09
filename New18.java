import java.util.*;
class New18{
    int n;
    New18()
    {
      n=622;  
    }
    New18(int nn)
    {
        n=nn;
    }
    void getnam(int nn)
    {
       n=nn; 
    }
    int sum_sq_digits(int x)
    {
        int r,s=0;
         while(x!=0)
        {
           r=x%10;
           s=s+(r*r);
           x=x/10;
        } 
        return s;
    }
    void ishappy()
    {
      int m;
      m=n;
      while(m>=10)
      {
          m=sum_sq_digits(m);
      }
      
      if(m==1)
      {
        System.out.println("happy birthday"+n);  
      }
      else
      {
         System.out.println("not a happy birthday"+n);  
      }
    }
    public static void main(String args[])
    {
       int n;
       Scanner sc = new Scanner(System.in);
       New18 ob= new New18(14);
       //System.out.println("enter a number");                  
       //n=sc.nextInt();
       //ob.getnam(n);
       ob.ishappy();
                     
           
       }
       
       
    }
