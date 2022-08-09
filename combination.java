import java.util.*;
class combination
{
    int n;
    int r;
    combination()
    {
        this.n=0;
        this.r=0;
    }
    void readnum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values of n and r");
        n=sc.nextInt();
        r=sc.nextInt();
    }
    int fact(int m)
    {
        if(m==0||m==1)
        {
            return 1;
        }
        else
        {
            return m*fact(m-1);
        }
    }
    void factseries()
    {
        int s=1;
        s=fact(this.n)/(fact(this.r)*fact((this.n)-(this.r)));
        System.out.println("\nRESULTS\n");
        System.out.println(s);
    }
    public static void main(String args[])
    {
       combination ob=new combination();
       ob.readnum();
       ob.factseries();
    }
}