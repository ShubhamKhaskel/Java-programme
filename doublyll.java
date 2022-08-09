import java.util.*;
class doublyll
{
    class Node 
    {
        int data;
        Node right;
        Node left;
        Node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    
    Node head;
    
    doublyll()
    {
        head=null;
    }
    
    public void addFirst(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            newnode.left=null;
            newnode.right=null;
            return;
        }
        else
        {
            newnode.right=head;
            newnode.left=null;
            head.left=newnode;
            head=newnode;
        }
    }
    
    public void addanywhere(int data,int place)
    {
        Node temp=head;
        Node newnode=new Node(data);
        for(int i=1;i<place-1;i++)
        {
           temp=temp.right; 
        }
        newnode.right=temp.right;
        //temp.right.left=newnode;
        temp.right=newnode;
        newnode.left=temp;
    }
    
    public void deletefromfirst()
    {
       if(head==null)
       {
           System.out.println("NOTHING TO DELETED.....");
       }
       else if(head.right==null)
       {
         head=null;  
       }
       else
       {
           head=head.right;
           head.left=null;
          
       }
    }
    
    public void deletefromback()
    {
        if(head==null)
       {
           System.out.println("NOTHING TO DELETED.....");
       }
       else if(head.right==null)
       {
         head=null;  
       }
       
       else
       {
           Node temp1=head;
           while(temp1.right.right!=null)
           {
               temp1=temp1.right;
           }
           temp1.right=null;
       }
    }
    
    public void print()
    {
        if(head==null)
        {
            System.out.println("NOTHING!!!!");
        }
        else
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"--->");
                temp=temp.right;
            }
        }
    }
    

 public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        doublyll ob1=new doublyll();
        ob1.addFirst(7);
        ob1.addFirst(6);
        ob1.addFirst(5);
        ob1.addFirst(4);
        ob1.addFirst(3);
        ob1.addFirst(2);
        ob1.addFirst(1);
        ob1.print();
        System.out.println();
        ob1.addanywhere(101,2);
        ob1.print();
        System.out.println();
        ob1.deletefromfirst();
        ob1.print();
        System.out.println();
        ob1.deletefromback();
        ob1.print();
    }
}