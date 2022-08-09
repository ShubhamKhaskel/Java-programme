import java.util.*;
     class inher2 
{   public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in); 
        class a
        {
           a()
           {
             System.out.println("methodddddddddd");  
           }
           void meth2()
            {
                System.out.println("method 2");
            }
         }
        class b extends a
         {
            void meth2()
            {
                System.out.println("lkjjhh");
            }
             void meth3()
            {
                System.out.println("method 3");
            }
         }
    
    b ob=new b();
    ob.meth2();
    ob.meth3();
  }
}

