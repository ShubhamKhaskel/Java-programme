import java.util.*;
public class linkedlistcollectionframe
{
    
   public static void main(String args[])
   {
       LinkedList<String> list=new LinkedList<String>();
       
       list.addFirst("a");
       list.addFirst("is");
       list.addFirst("this");
       list.addFirst("Shubham");
       System.out.println(list);
       
       list.addLast("prog");
       System.out.println(list);
       
       System.out.println(list.size());
       
       for(int i=0;i<list.size();i++)
       {
           System.out.print(list.get(i)+"->");
       }
       System.out.print("null"+"\n");
       
       list.removeFirst();
       System.out.println(list);
       
       list.removeLast();
       System.out.println(list);
       
       list.remove(0);//removing the second index;
       System.out.println(list);
   }
}