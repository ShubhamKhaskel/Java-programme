import java.util.*;
class duplicate
{
    public static boolean func(int a[],int len)
    {
       for(int i=0;i<len;i++)
       {
           for(int j=i+1;j<len;j++)
           {
               if(a[i]==a[j])
               {
                   return true;
               }
               else
               continue;
           }
       }
       return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int[] a=new int[5];
      int len=5;
      for(int i=0;i<len;i++)
      {
          a[i]=sc.nextInt();
      }
      for(int i=0;i<len;i++)
      {
          System.out.print(a[i]+" ");
      }
      System.out.println();
      boolean flag=func(a,len);
      
      if(flag==true)
      {
          System.out.println("TRUE");
      }
      else
      {
        System.out.println("FALSE");  
      }
    }
}