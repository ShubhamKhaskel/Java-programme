import java.util.*;
     class dynamic 
{   public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in); 
    class Phone
    {
        void greet()
        {
          System.out.println("GOOD MORNING");
        }
        void name()
        {
          System.out.println("My name is Java");
        }
    }
    class Smartphone extends Phone
    {
       void swagat()
       {
          System.out.println("SWAGAT"); 
       }
       void name()
       {
         System.out.println("My name is Java in class two");  
       }
    }
    
    Phone obj=new Smartphone(); //object creation on runtime
    obj.greet();
    obj.name(); 
    //obj.swagat(); //cannot call func of smartphn
  }
}