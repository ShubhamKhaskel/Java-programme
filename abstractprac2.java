import java.util.*;
abstract class Shape
{
    abstract void defineShape();
}
class Circle extends Shape
{
    void defineShape()
    {
       System.out.println("This is a Circle...."); 
    }
}
class Box extends Shape
{
    void defineShape()
    {
       System.out.println("This is a Box...."); 
    }
}
class Square extends Shape
{
    void defineShape()
    {
       System.out.println("This is a Square...."); 
    }
}
class Shapetest 
{
    void display(Shape ob)
    {
        ob.defineShape();
        
    }
}
public class abstractprac2
{
    public static void main(String args[])
    {
        Shapetest ob=new Shapetest();
        System.out.println("Enter a choice  ");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                Circle ob1=new Circle();
                ob.display(ob1);
                break;
            case 2:
                Box ob2=new Box();
                ob.display(ob2);
                break;
            case 3:
                Square ob3=new Square();
                ob.display(ob3);
                break;
        }
    }
}
