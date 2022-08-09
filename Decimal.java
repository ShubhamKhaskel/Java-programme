import java.util.*;

    public class Decimal
    {
    int no,base;
    Decimal(int name,int b)
    {
        this.no=name;
        this.base=b;
    }
    public void disp()
    {
        String s=Decimaltoanybase();
        System.out.println(s);

    }
    String Decimaltoanybase()
    {
        String a;
        a="";
        int a1;
        while(no>0)
        {
           a1=no%base;
           if(a1>=10)
           {
               a1=a1+55;
               char x=(char)a1;
            a=x+a;
           }
           /*else if(a1==11)
           {
            a=a+'B';
           }
           else if(a1==12)
           {
            a=a+'C';
           }
           else if(a1==13)
           {
            a=a+'D';
           }
           else if(a1==14)
           {
            a=a+'E';
           }
           else if(a1==15)
           {
            a=a+'F';
           }*/
           else
           {
           a=a1+a;
           }
           no=no/base;
           
        }
        return a;
    }
    
    public static void main(String args[])
    {
        Decimal ob=new Decimal(45,16);
        ob.disp();        
        
    }
}