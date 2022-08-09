import java.util.*;
class base
{
    int y=10;
    public void display()
    {
        System.out.print("base");
    }
}
class child1 extends base
{
     int y=20;
    public void display()
    {
        System.out.print("child1");
    }
}
class child2 extends base
{
    int y=30;
    public void display()
    {
        System.out.print("child2");
    }
}
class program
{
    public void show(base ob)
    {
        ob.display();
         System.out.println(ob.y);
        if(ob instanceof child1)
        {
          child1 x=(child1)ob;
          x.display();
          System.out.println(x.y);
        }
        else if(ob instanceof child2)
        {
          child2 x=(child2)ob;
          x.display(); 
          System.out.println(x.y);
        }
        else
        {
          ob.display();
          System.out.println(ob.y);
        }
    }
}
public class inher4
{
    public static void main(String args[])
    {
        // program ob=new program();
        // child1 ob1=new child1();
        // child2 ob2=new child2();
        // base ob3=new base();
        // ob.show(ob3);
        // ob.show(ob1);
        // ob.show(ob2);
        program ob=new program();
        base ob1;
        ob1=new child1();
        ob.show(ob1);
        
        ob1=new child2();
        ob.show(ob1);
    }
}



