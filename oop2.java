import java.util.*;
class oop2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        /*class Cellphone
        {
            void ring()
            {
                System.out.println("ringing");
            }
            void vibrate()
            {
                System.out.println("vibrating");
            }
            void calling()
            {
                System.out.println("calling");
            }
        }
        
        Cellphone shuv=new Cellphone();
        shuv.vibrate();
        */
        class Square
        {
           int a;
           int p()
           {
              return 4*a; 
           }
           int area()
           {
               return a*a;
           }
        }
        Square shuv=new Square();
        shuv.a=5;
        System.out.println(shuv.p());
        System.out.println(shuv.area());
    }
}