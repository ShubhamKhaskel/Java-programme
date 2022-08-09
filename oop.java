import java.util.*;
class oop{
   
    int[] arr;
    int cap;
    int  top;
    
    oop(int max)
    {
      this.cap=max;
      this.top=-1;
      int arr[]=new int[cap];
    }
    void push(int v)
    {
        if(top==cap-1)
        {
            System.out.println("stack full\n");
        }
        else if(top==-1)
        {
            top=0;
            arr[top]=v;
        }
        else
        {
            top++;
            arr[top]=v;
        }
    }
    void pop()
    {
       if(top==-1)
       {
          System.out.println("\n"+ -999); 
       }
       else
       {
          System.out.println("\nthe deleted element is "+ arr[top]);
          top--;
       }
    }
    void display()
    {
        int i;
       if(top!=-1)
       {
           for(i=top;i>=0;i++)
           {
               System.out.println("\n..."+arr[i])
           }
       }
       else
       {
           System.out.println("empty");
       }
    }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in)
        int 
        do
        {
            System.out.println("\n1-Push\n2-Pop\n3-Display\n4-Enter your choice");
            
        }
    }
}

