import java.util.*;
class Rectangle
{
    int length;
    int breadth;
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public int area()
    {
        int area=0;
        area=length*breadth;
        return area;
    }
    public void display()
    {
        System.out.println("Length->"+length);
        System.out.println("Breadth->"+breadth);
        System.out.println("Area------>"+area());
    }
}
class Cuboid extends Rectangle
{
    int height;
    Cuboid(int length,int breadth,int height)
    {
        super(length,breadth);
        this.height=height;
    }
    public int volume()
    {
        int v=0;
        v=area()*this.height;
        return v;
    }
    public void display()
    {
        System.out.println("Length->"+length);
        System.out.println("Breadth->"+breadth);
        System.out.println("Height->"+height);
        System.out.println("Volume------>"+volume());
    }
}
public class inher5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Cuboid ob=new Cuboid(5,6,7);
        ob.display();
        
    }
}
