import java.util.*;
class TestProg // extends Object
{
    String name;
    int age;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and age ");
        name=sc.next();
        age=sc.nextInt();
    }
   /*public String toString()
    {
        System.out.println("Hello");
        return (name+"  "+age);
    }*/
    public static void main()
    {
        TestProg ob =new TestProg();
        ob.getdata();
        System.out.println(ob);
    }
}