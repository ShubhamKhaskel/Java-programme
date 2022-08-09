import java.util.*;
public class linkedlist2
{ Node head;
  //private int size;
  
  linkedlist2()
  {
      head=null;
      //this.size=0; 
  }
  
  class Node
  {
      String data;
      Node next;
      
      Node(String data)
      {
         this.data=data;
         this.next=null;
         //size++;
      }
  }
  //add at first
  public void addFirst(String data)
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
  public void addLast(String data)
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
      //size--;
      head=head.next;
  }
  //delete last
  public void deletelast()
  {
      if(head==null)
      {
          System.out.println("EMPTY LIST");
      }
      //size--;
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
  //public int getsize()
  //{
      //return size;
  //}
  
    public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in); 
    linkedlist2 list =new linkedlist2();
    list.addFirst("a");
    list.addFirst("is");
    list.addFirst("this");
    list.printlist();
    
    list.addLast("prog");
    list.printlist();
    
    list.deletefirst();
    list.printlist();
    
    list.deletelast();
    list.printlist();
    
    //System.out.println("size="+list.getsize());
  }
}