import java.util.*;
class armnum
{
    int n;
    int l;
    armnum(int nn)
    {
        this.n=nn;
        this.l=0;
        while(nn>0)
        {
            this.l++;
            nn=nn/10;
        }
        System.out.println(l);
    }
    public int sum_power(int i)
    {
        if(i>0)
        {
            return ((int)Math.pow((i%10),l)+sum_power(i/10));
        }
        else
        {
            return 0;
        }
    }
    public void isarm()
    {
        if(n==sum_power(n))
        {
            System.out.println("ARMSTRONG");
        }
        else
        {
            System.out.println("NOT AN ENGLISH MAN");
        }
    }
    
    public static void main(String args[])
    {
        armnum ob=new armnum(153);
        //ob.sum_power(153);
        ob.isarm();
    }
}