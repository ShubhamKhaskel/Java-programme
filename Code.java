import java.util.*;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int sum=0;
        while(t>0)
        {
            int rem=t%10;
            if(rem!=0)
            {
                sum=sum*10+rem;
            }
            t=t/10;
        }
        //System.out.println(sum);
        int temp=sum;
        int s=0;
        while(temp>0)
        {
            int rem=temp%10;
            s=s*10+rem;
            temp=temp/10;
        }
        System.out.println(s);
    }
}