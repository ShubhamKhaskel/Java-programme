import java.util.*;
public class Consecutive
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=(n+1)/2;i++)
        {
           int sum=0;
           int x=i;
           String s="";
           do
           {
               sum=sum+x;
               s=s+x+"+";
               x++;
               
           }while(sum<n);
           if(sum==n)
           {
               System.out.println(s.substring(0,s.length()-1));
           }
        }
    }
}