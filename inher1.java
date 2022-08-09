import java.util.*;
class circle
{
    public int radius;
    circle(int r)
    {
        this.radius=r;
    }
    public double area()
    {
        return Math.PI*this.radius*this.radius;
    }
}
class cylin extends circle
{
    public int height;
    cylin(int r,int h)
    {
        super(r);
        this.height=h;
    }
    public double volume()
    {
        return this.height*Math.PI*this.radius*this.radius;
    }
}
public class inher1
{
    public static void main(String args[])
    {
        cylin ob=new cylin(7,5);
        System.out.println(ob.volume());
        
    }
}
