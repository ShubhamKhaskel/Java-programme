//find nth node from last + delete nth node
import java.util.*;
class dsa1
{
    public ListNode remove(ListNode head,int n)
    {
      if(head.next==null)
      {
         return null; 
      }
      int size=0;
      ListNode curr=head;
      while(curr!=null)
      {
          curr=curr.next;
          size++;
      }
      if(n==size)
      {
          return head.next;
      }
      int indextosearch=size-n;
      ListNode prev=head;
      int i=0;
      while(i<indextosearch)
      {
        prev=prev.next;  
      }
      prev.next=prev.next.next;
      return head;
    }
    public static void main(String args[])
    {
        
    }
}
