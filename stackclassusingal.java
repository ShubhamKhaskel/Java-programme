import java.util.*;
public class stackclassusingal
{
    static class stack
    {
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty()
        {
            return list.size()==0;
        }
        public static void push(int data)
        {
            list.add(data);
        }
        public static int pop()
        {
            if(isEmpty()==true)
            {
                return -1;
            }
            else
            {
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
            }
        }
        public static int peek()
        {
            if(isEmpty()==true)
            {
                return -1;
            }
            else
            {
                return list.get(list.size()-1);
            }
        }
        public static void display()
        {
            int i=list.size()-1;
            while(i>=0)
            {
                System.out.print(list.get(i)+" ");
                i--;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.display();
        int p=s.pop();
        System.out.println();
        
        s.display();
        System.out.println();
        System.out.println(s.peek());
        
        System.out.println();
    }
}