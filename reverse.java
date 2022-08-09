import java.util.*;
public class reverse
{ Node head;
  private int size;
  reverse()
  {
      this.size=0;
  }
  
  class Node
  {
      int data;
      Node next;
      
      Node(int data)
      {
         this.data=data;
         this.next=null;
         size++;
      }
  }
  //add at first
  public void addFirst(int data)
  {
     Node newnode=new Node(data);
     if(head==null)
     {
         head=newnode;
         return;
     }
     newnode.next=head;
     head=newnode;
  }
  //add at last
  public void addLast(int data)
  {
      Node newnode=new Node(data);
      if(head==null)
      {
          head=newnode;
          return;
      }
      Node currnode=head;
      while(currnode.next!=null)
      {
          currnode=currnode.next;
      }
      currnode.next=newnode;
  }
  //print
  public void printlist()
  {
      if(head==null)
      {
          System.out.println("EMPTY LIST");
          return;
      }
      Node currnode=head;
     while(currnode!=null)
     {
         System.out.print(currnode.data + "->");
         currnode=currnode.next;
     }
     System.out.println("NULL");
  }
  //delete first
  public void deletefirst()
  {
      if(head==null)
      {
          System.out.println("EMPTY LIST");
      }
      size--;
      head=head.next;
  }
  //delete last
  public void deletelast()
  {
      if(head==null)
      {
          System.out.println("EMPTY LIST");
      }
      size--;
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
  }
  //getting size
  public int getsize()
  {
      return size;
  }
  //reverse
  public void reverseit()
  {
      if(head==null || head.next==null)
      return;
      
      Node prev=head;
      Node curr=head.next;
      while(curr!=null)
      {
          Node nextnode=curr.next;
          curr.next=prev;
          //update
          prev=curr;
          curr=nextnode;
      }
      head.next=null;
      head=prev;
  }
  //reverse using recursion
  public Node reverserecur(Node head) 
  {
      if(head==null||head.next==null)
      {
          return head;
      }
    Node newhead=reverserecur(head.next);
    head.next.next=head;
    head.next=null;
    return newhead;
  }
    public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in); 
    reverse list =new reverse();
    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.addLast(5);
    list.printlist();
    list.reverseit();
    list.printlist();
  }
}