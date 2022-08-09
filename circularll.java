import java.util.*;
public class circularll
{
    
  Node head;
  Node tail;
    circularll()
  {
      head=null;
      tail=null;
  }
  
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
  
  //add at first
  
  public void addFirst(int data)
  {
     Node newnode=new Node(data);
     if(head==null)
     {
         head=newnode;
         tail=newnode;
         newnode.next=head; 
         return;
     } 
     newnode.next=head;
     head=newnode;
     tail.next=head;
  }
  //add at last
  
  public void addLast(int data)
  {
      Node newnode=new Node(data);
      if(head==null)
      {
          head=newnode;
          tail=newnode;
          newnode.next=head;
          return;
      }
      tail.next=newnode;
      tail=newnode;
      tail.next=head;
  }
  
  //print
  
  public void printlist()
  {
      Node currnode=head;
      if(head==null)
      {
          System.out.println("EMPTY LIST");
          return;
      }
      else
      {
     while(currnode!=head)
     {
         System.out.print(currnode.data + "->");
         currnode=currnode.next;
     }
    }
     //System.out.println("NULL");
  }
  //delete first
  /*public void deletefirst()
  {
      if(head==null)
      {
          System.out.println("EMPTY LIST");
      }
      head=head.next;
  }
  //delete last
  public void deletelast()
  {
      if(head==null)
      {
          System.out.println("EMPTY LIST");
      }

      if(head.next==null)
      {
         head=null;
         return;
      }
      Node secondlast=head;
      Node last=head.next;//last=null then last.next=error 
      while(last.next!=null)
      {
         last=last.next;
         secondlast=secondlast.next;
      }
      secondlast.next=null;
  }*/
  
  //getting size
  
    public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in); 
    circularll list =new circularll();
    /*list.addFirst(3);
    list.addFirst(2);
    list.addFirst(1);
    list.printlist();*/
    System.out.println();
    list.addLast(3);
    list.addLast(2);
    list.addLast(1);
    list.printlist();
    
    /*list.addLast("prog");
    list.printlist();
    
    list.deletefirst();
    list.printlist();
    
    list.deletelast();
    list.printlist();
    
    System.out.println("size="+list.getsize());
    */
  }
}