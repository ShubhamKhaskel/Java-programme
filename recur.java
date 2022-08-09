import java.util.*;
class recur{
    int num;
    int size;
    
    recur(int nn)
    {
        this.num=nn;
        this.size=0;
    }
    void countDigit()
    {
        int n=num;
        while(n!=0)
        {
          n=n/10; 
          size++;
        }
    }
    int sumofDigits(int n,int p)
    {
        int t,s=1,m=0,i;
       for(i=p;i>=1;i--)
       {
         t=n%10;
         n=n/10;
         s=(int)Math.pow(t,i);
         m=m+s;
       }
       return m;
    }
    void check()
    {
        countDigit();
        int m=sumofDigits(num,size);
        System.out.println(m);
        if(m==num)
        {
          System.out.println("\nIt is a Disarium no"); 
        }
        else
        {
            System.out.println("\nIt is not a Disarium no"); ;
        }
    }
    
    public static void main(String args[])
    {
        int no;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        no=sc.nextInt();
        recur ob=new recur(no);
        ob.check();
        
        
    }
}
