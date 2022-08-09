import java.util.*;
class oop4
{
    public static void main(String args[])
    {
      /*class Base
      {
          int x;
          Base()
          {
              //System.out.println("i am a cons");
          }
          int t()
          {
              return 5;
          }
      }
      class Derived extends Base
      {
         
         
         
      }
      Derived ob=new Derived();
      System.out.println(ob.t());
      */
     
      class Base
      { 
            public int x;
            Base()
          {
           System.out.println("englishman");   
          }
          Base(int a)
          {
              System.out.println("......."+a);
          }       
          int getX()
          {
              return x;
          }
          void setX(int x)
          {
              this.x=x;
          }
      }
      class Derived extends Base
      {
          public int y;
          Derived()
          {
              super(18);
              System.out.println("inheritttt");

          }
          int getY()
          {
              return y;
          }
          void setY(int y)
          {
              this.y=y;
          }
      }
      //Base b=new Base();
      Derived d=new Derived();
    }
}