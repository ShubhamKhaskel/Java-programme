import java.util.*;
public class arraydeque
{   public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in); 
    ArrayDeque<Integer>ad=new ArrayDeque<>();      
    ad.add(101);
    ad.add(102);
    ad.add(103);
    ad.addFirst(11111); 
    
    System.out.println(ad.getFirst());
    System.out.println(ad.getLast());
  }
}