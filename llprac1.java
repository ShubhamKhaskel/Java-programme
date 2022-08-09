import java.util.*;
class llprac1
{
    public static void main(String args[])
    {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.push(5);
        l1.push(0);
        l1.push(0);
        l1.push(0);
        l1.push(3);
        l1.push(0);
        l1.push(4);
        l1.push(5);
        
        for(int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i)+"->");
        }
        
        System.out.println();
        
        int t=l1.size();
        int i=0;
        while(i<t)
        {
            if(l1.get(i)==0)
            {
                l1.remove(i);
                t=l1.size();
                //t=l1.size();
                //System.out.println(i);
            }
            
        }   
        
        
        for(int j=0;j<l1.size();j++)
        {
            System.out.print(l1.get(i)+"->");
        }
    }
}