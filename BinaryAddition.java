import java.util.*;

    public class BinaryAddition
    {
    String s;
    BinaryAddition(String s)
    {
       this.s=s;
    }
    BinaryAddition()
    {
        this.s="";
    }
    public void display()
    {
        System.out.println(this.s);
    }
    public void samelength(BinaryAddition ob1,BinaryAddition ob2)
    {
        int l1=ob1.s.length();
        int l2=ob2.s.length();
            if(l1>l2)
            {
                int l3=l1-l2;
                for(int j=0;j<l3;j++)
                {
                    ob2.s="0"+ob2.s;
                }
            }
            else
            {
               int l3=l2-l1;
                for(int j=0;j<l3;j++)
                {
                    ob1.s="0"+ob1.s;
                } 
            }
            
        
    }
    public void bit()
    {
        int len=s.length();
        if(len<8)
        {
            for(int j=0;j<(8-len);j++)
            {
                s='0'+s;
            }
        }
    }
    public void add(BinaryAddition ob1,BinaryAddition ob2)
    {
        int carry=0,sum=0,q=0;
        int l=ob1.s.length();
        for(int j=l-1;j>=0;j--)
        {
          q=(ob1.s.charAt(j)-48)+(ob2.s.charAt(j)-48)+carry; 
          //System.out.println(q);
          sum=q%2;
          s=sum+s;
          carry=q/2;
          
        }
        if(carry==1)
        s=carry+s;
        else
        s=s;
    }
    public static void main(String args[])
    {
        BinaryAddition ob1=new BinaryAddition("1001");
        BinaryAddition ob2=new BinaryAddition("11");
        BinaryAddition ob3=new BinaryAddition();
        //ob3.samelength(ob1,ob2);
        //ob1.display();
        //ob2.display();
        ob1.bit();
        ob2.bit();
        ob1.display();
        ob2.display();
        ob3.add(ob1,ob2);
        ob3.display();
        
        
    }
}