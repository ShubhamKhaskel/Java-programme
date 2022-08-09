import java.util.*;
class codechef1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        
        int t=sc.nextInt();
        for(i=1;i<=t;i++)
        {
          int area=0,m=0,flag=0;
          int c=sc.nextInt();
          int budget=sc.nextInt();
          for(j=1;j<=c;j++)
          {
            int l=sc.nextInt();
            int b=sc.nextInt();
            int p=sc.nextInt();
            if(p<=budget)
            {
               flag=1;
               area=l*b;
               if(area>m)
               {
                   m=area;
               }
            }
            else
            {
                continue;
            }
          }
          if(flag==1)
          {
              System.out.println(m);
          }
          else
          {
            System.out.println("no tablet");  
          }
          
          
        }
    }
}