import java.util.*;
class matrev
{
    int arr[][];
    int m;
    int n;
    int rev;
    matrev(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
        rev=0;
    }
    public void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    /*public int reverse(int x)
    {
        int rev=0;
        while(x!=0)
        {
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        return rev;
    }*/
    public int reverse(int x)
    {
        if(x<10)
        {
            rev=rev*10+x;
            return rev;
        }
        else
        {
          int rem=x%10; 
          rev=rev*10+rem;
          return reverse(x/10);
            
        }
    }
    public void revmat(matrev p)
    {
      int i,j;
      for(i=0;i<m;i++)
      {
          for(j=0;j<n;j++)
          {
              rev=0;
              arr[i][j]=reverse(p.arr[i][j]);
          }
      }
    }
    public void show()
    {
        int i,j;
        for(i=0;i<m;i++)
      {
          for(j=0;j<n;j++)
          {
             System.out.print(arr[i][j]+" "); 
          }
          System.out.println();
      }
      System.out.println();
    }
    public static void main(String args[])
    {
        matrev ob1=new matrev(3,3);
        matrev ob2=new matrev(3,3);
        ob1.fillarray();
        ob2.revmat(ob1);
        ob1.show();
        ob2.show();
    }
}
