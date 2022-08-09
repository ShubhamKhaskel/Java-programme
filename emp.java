import java.util.*;
class emp
{
    int id;
    String name;
    void details()
    {
        System.out.format("%s..%d",name,id);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        emp ob1=new emp();
        ob1.id=123;
        ob1.name="shubham";
        ob1.details();
        emp ob2=new emp();
        ob2.id=1
        ;
        ob2.name="bony";
        ob2.details();
        //System.out.format("%s..%d",ob.name,ob.id);
    }
}