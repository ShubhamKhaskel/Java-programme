import java.util.*;
public class stackusingll
{
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    Node head;
    
        //public Node head;
        public void push(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                return;
            }
            else
            {
                newNode.next=head;
                head=newNode;
            }
        }
        
        public int pop()
        {
            
            if(head==null)
            {
                return -1;
            }
            else
            {
                int top=head.data;
                head=head.next;
                return top;
            }
        }
        
        public int peek()
        {
            int top=head.data;
            if(head==null)
            {
                return -1;
            }
            else
            {
                return top;
            }
        }
        
        public void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        /*public static void pushatbottom(int data)
        {
            Node temp=head;
            Node n=new Node(data);
            while(temp.next!=null)
            {
               temp=temp.next; 
            }
            temp.next=n;
            System.out.println();
        }*/
        /*public static void reverse()
        {
            Node temp1=head;
            Node temp2=head.next;
            while(temp2.next!=null)
            {
                temp1=temp1.next;
                temp2=temp2.next;
            }
            temp2.next=temp1;
        }*/
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        stackusingll s=new stackusingll();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        //s.pushatbottom(6);
        s.display();
        int p=s.pop();
        System.out.println();
        
        s.display();
        System.out.println();
        System.out.println(s.peek());
    }
}