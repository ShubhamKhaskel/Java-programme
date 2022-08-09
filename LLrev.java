//to find if a linked list is pallindrome or not
import java.util.*;
class LLrev
{ 
    ListNode head;
    
    public class ListNode
    {
        ListNode next;
        int val;
        ListNode(int val)
        {
            this.val=val;
            this.next=null;
        }
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        return prev; 
        
    }
    public ListNode findMiddle(ListNode head)
    {
        int size=0;
        while(head!=null)
        {
            head=head.next;
            size++;
        }
        if(size%2==0)
        {
            for(int i=1;i<size/2;i++)
            {
                head=head.next;
            }
            return head;
        }
        else
        {
            for(int i=1;i<(size+1)/2;i++)
            {
                head=head.next;
            }
            return head;
        }
    }
    
    public boolean ispalindrome(ListNode head)
    {
        if(head==null||head.next==null)
        {
          return true;  
        }
        ListNode middle=findMiddle(head);//1st half end
        ListNode secondhalf=reverse(middle.next);
        
        ListNode firsthalf=head;
        while(secondhalf!=null)
        {
            if(firsthalf.val!=secondhalf.val)
            { 
                return false;
            }
            else
            {
                firsthalf=firsthalf.next;
                secondhalf=secondhalf.next;
            }
        }
        return true;
    }
}