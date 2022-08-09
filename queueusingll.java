import java.util.*;
public class queueusingll
{
    static class Node
    {
         int data;
         Node next;
         Node(int data)
         {
             this.data=data;
             this.next=null;
         }
    }
    static class queue
    {
        static Node head=null;
        static Node tail=null;
        
        public static void add(int data)
        {
            Node newNode=new Node(data);
            if(tail==null && head==null)
            {
                head=tail=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }
        
        public static int remove()
        {
            if(head==null && tail==null)
            {
              System.out.println("nothing to remove"); 
              return -1;
            }
            
            if(head==tail)
            {
                int f=head.data;
                tail=null;
                return f; 
            }
            else 
            {
               int f=head.data;
               head=head.next;
               return f;
            }
        }
        
        public static int peek()
        {
            if(head==null && tail==null)
            {
                System.out.println("cant be peeked empty!!");
                return -1;
                
            }
            return head.data;
        }
        
        public static void display()
        {
            if(head==null && tail==null)
            {
                System.out.println("Nei kichu");
                
            }
            else
            {
                Node temp=head;
                while(temp!=null)
                {
                    System.out.println(temp.data+"-->");
                    temp=temp.next;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        queue ob1=new queue();
        ob1.add(1);
        ob1.add(2);
        ob1.add(3);
        ob1.add(4);
        ob1.add(5);
        //System.out.println(ob1.peek());
        ob1.display();
        ob1.remove();
        ob1.remove();
        System.out.println("AFTER REMOVING........");
        ob1.display();
    }
}
