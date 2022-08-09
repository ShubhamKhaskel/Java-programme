public class chilled implements interface10,interface11
{
     
    public void disp()
    {
        System.out.println("P");
    }
       public void disp1()
    {
        System.out.println("P1");
    }
    static void main()
    {
        chilled ob = new chilled();
        ob.disp();
        ob.disp1();
       
        System.out.println(interface10.a);
    }
}