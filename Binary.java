import java.util.*;

    public class Binary
    {
    String s;
    int base;
    Binary(String s,int base)
    {
        this.s=s;
        this.base=base;
    }
    //1100
    public int convert()
    {
       int len=s.length();
       int sum=0;
       for(int i=len-1;i>=0;i--)
       {
           System.out.println(s.charAt(i));
           sum+=(int)(s.charAt(i)-48)*Math.pow(base,(len-1-i));
           //System.out.println(sum);
       }
       return sum;
    }
    
    public boolean isValid()
    {
        for(int i=0;i<s.length();i++)
        {
            if((int)s.charAt(i)>=base)
            {
                return false;
            }
        }
        return true;
        
    }
    
    public static void main(String args[])
    {
        Binary ob=new Binary("1100",2);
        boolean t=ob.isValid();
        if(t==true)
        {
        int sum=ob.convert();
        System.out.println(sum);
        }
        else
        {
            System.out.println("NONE");
        }
        
    }
}