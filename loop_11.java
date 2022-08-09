import java.util.*;
public class loop_11 {
    public static boolean isprime(int n)
    {
        int count=0;
        for(int i=1;i<n/2;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==1)
        {
            return true;
        }
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int len=0;
        while(t>0)
        {
          int rem=t%10;
          len++;
          t=t/10;
        }
        int i=1;
        while(i<=len)
        {
          int rem=n%10;   //3
          n=n/10;         //119
          
          n=rem*(int)Math.pow(10,len-1)+n;
          System.out.println(n);
          i++;
        }
    }
    
}