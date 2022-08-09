import java.util.*;
interface first
{
    int a=5;
    int b=6;
    int func1();
}
interface second extends first
{
    int c=7;
    void func2();
}
abstract class third implements first,second
{
    public int func1()
    {
        System.out.println("AREA->"+(a*b));
        return (a*b);
    }
    public void func2()
    {
       System.out.println("VOLUME->"+((func1())*c)); 
    }
    abstract void func3(); 
}
public class interface_and_abstract extends third
{
    void func3()
    {
        System.out.println("I AM YES!!");
    }
    public static void main(String args[])
    {
        interface_and_abstract ob=new interface_and_abstract();
        ob.func1();
        ob.func2();
        ob.func3();
    }
}
