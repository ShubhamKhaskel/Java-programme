import java.util.*;
class palindromelinkedlist
{
    int sizes;
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
    palindromelinkedlist()
    {
        head=null;
    }
    
    public void add(int data)
    {
       Node newnode=new Node(data);
       if(head==null)
       {
           head=newnode;
       }
       else
       {
           Node temp=head;
           while(temp.next!=null)
           {
              temp=temp.next; 
           }
           temp.next=newnode;
       }
    }
    
    public int size()
    {
        Node temp=head;
        while(temp!=null)
           {
              sizes=sizes+1; 
              temp=temp.next; 
           }
           return sizes;
    }
    
    public int get(int location)
    {
        Node temp=head;
        int i=0;
        if(temp==null)
        {
            return -1;
        }
        while(i<location)
        {
           temp=temp.next; 
           i++;
        }
        return temp.data;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //LinkedList<Integer> l1=new LinkedList<Integer>();
        palindromelinkedlist l1=new palindromelinkedlist();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(3);
        l1.add(2);
        l1.add(1);
        int p=l1.size();
       int mid=l1.get(p/2);
        System.out.println("Middle data "+mid);
        
        //reverse
        //LinkedList<Integer> l2=new LinkedList<Integer>();
        palindromelinkedlist l2=new palindromelinkedlist();
     
         for(int i=p-1;i>=0;i--)
        {
            int q=l1.get(i);
            l2.add(q);
        }
     
        int flag=0,s=l2.size();
        for(int i=0;i<s;i++)
        {
            if(l1.get(i)==l2.get(i))
            {
                flag=0;
            }
            else
            {
                flag=1;
                break;
            }
        }
        
        if(flag==1)
        {
            System.out.println("Not a palindrome linked list ");
        }
        else
        {
            System.out.println("Palindrome linked list ");
        }
    }
}