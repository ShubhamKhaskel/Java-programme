import java.util.*;
public class try1
{   public static void main(String args[])
  { 
    System.out.flush();  
    Scanner sc=new Scanner(System.in);
    int a=6000;
    int b=0;
    try
    {
        int c=a/b;
        System.out.println("The results is "+c);
    }
    catch(Exception e)
    {
        System.out.println("WE FAILED");
        System.out.println(e);
    }
    System.out.println("...............");
  }
}