import java.util.*;
//non-contiguous
//.)insertion time is less O(1)
//.)searching time is more O (n)
public class linkedlist1
{   public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in); 
    LinkedList<Integer>l1=new LinkedList<>();
    LinkedList<Integer>l2=new LinkedList<>();
    l2.add(101);
    l2.add(102);
    l2.add(103);
        
    l1.add(6);
    l1.add(5);
    l1.add(9);
    
    l1.add(0,99);//0-index we are adding 99 and the list shifts down
    l1.addAll(0,l2);
    l1.addLast(999);
    //l1.clear(); //clears the ArrayList
    System.out.println(l1.contains(100));//return true if found in list
    System.out.println(l1.indexOf(101));//index of the number
    
    for(int i=0;i<l1.size();i++)
    { 
       System.out.print(l1.get(i)+" ");
    }
  }
}