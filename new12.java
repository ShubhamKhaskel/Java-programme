import java.util.*;
class new12
{
    public static void main(){
        int i=2,flag=0,n,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        t=n;
        while(i<=t)
        {
            while(t%i==0)
            {
                t=t/i;
                if(i>5)
                {
                    flag=1;
                }
            }
            i++;
        }
        if(flag==0)
        {
            System.out.println("ugly number");
        }
        else
        {
            System.out.println("not an ugly number");
        }
        
        
    }
}

