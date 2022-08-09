import java.util.*;
class stackcollectionfrm
{        
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        //s.display();
        for(int i=s.size()-1;i>=0;i--)
        {
         System.out.print(s.get(i)+" ");   
        }
        System.out.println();
        int p=s.pop();
        System.out.println(p);
        
        System.out.println(s.peek());
        
        //System.out.println();
    }
}
