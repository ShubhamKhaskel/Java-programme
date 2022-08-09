import java.util.*;
class new5
{
    public static void main(String args[])
    {
       String  a;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a String");
       a=sc.nextLine().toUpperCase().trim();
       int l=a.length();
       
       char x=a.charAt(0);
       String w=a.substring(0,3);
       
       System.out.println(" "+x);
        System.out.println(" "+w);
         w=a.substring(3);
         System.out.println(" "+w);
         int p=a.indexOf('I');
          System.out.println(" "+p);
           p=a.indexOf('I',2);
          System.out.println(" "+p);
            p=a.lastIndexOf('I');
          System.out.println(" "+p);
          boolean s=a.equalsIgnoreCase("India");
           System.out.println(" "+s);
    }
}