import java.util.*;
//dynamic array 
//.)insertion takes more time O(n)
//.)search takes less time O(1)
public class arraylist 
{   public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in); 
    ArrayList<Integer>l1=new ArrayList<>();
    ArrayList<Integer>l2=new ArrayList<>();
    l2.add(0);
    l2.add(2);
    l2.add(3); 
    System.out.println(l2);
    
    //get element
    
    int e=l2.get(1); //element at 1th index
    System.out.println(e);
    
    //add in between
    
    l2.add(1,99);  //adding 99 at 1th index
    System.out.println(l2);
    
    //set element
    
    l2.set(0,11111); //changing the element at 0th index to 11111
    System.out.println(l2);
    
    //delete element
    
    l2.remove(2);  //deleting the element at 2th index
    System.out.println(l2);
    
    //size 
    
    int s=l2.size();
    System.out.println(s);
    
    //loops
    
    for(int i=0;i<l2.size();i++)
    {
        System.out.print(l2.get(i)+" ");
    }
    System.out.println();
    
    //sorting
    
    Collections.sort(l2);
    System.out.print(l2+" ");
    
    //////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
      
    
    
    /*l1.add(6);
    l1.add(5);
    l1.add(9);
    
    l1.add(0,99);//0-index we are adding 99 and the list shifts down
    l1.addAll(0,l2);
    //l1.clear(); //clears the ArrayList
    System.out.println(l1.contains(100));//return true if found in list
    System.out.println(l1.indexOf(101));//index of the number
    
    for(int i=0;i<l1.size();i++)
    { 
       System.out.print(l1.get(i)+" ");
    }*/
  }
}