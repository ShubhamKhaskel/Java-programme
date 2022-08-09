import java.util.*;
class llprac
{
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    llprac()
    {
        head=null;
    }
    
    public void push(int data)
    {
        Node newnode=new Node(data);
        Node temp=head;
        if(head==null)
        {
            head=newnode;
            return;
        }
        else
        {
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    
    public void show()
    {
      Node temp=head;
      if(temp==null)
      {
          System.out.println("kichu nei");
      }
      while(temp==null)
      {
          System.out.print(temp.data+"->");
          temp=temp.next;
      }
    }
    
    public static void main(String args[])
    {
        llprac l1=new llprac();
        l1.push(1);
        l1.push(2);
        l1.push(3);
        l1.push(4);
        l1.push(5);
        l1.push(6);
        l1.push(7);
        l1.show();
    }
}