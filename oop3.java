import java.util.*;
import java.lang.Math;
class oop3
{
    public static void main(String args[])
    {
        class Cylin
        {
          int r;
          int h;
          Cylin()
          {
              this.r=5;
              this.h=12;
          }
          void setradi(int radi)
          {
              this.r=radi;
          }
          void setheight(int height)
          {
              this.h=height;
          }
          int getradi()
          {
              return r;
          }
          int getheight()
          {
              return h;
          }
          double volume()
          {
              return (3.14*(Math.pow(r,2))*h);
          }
        }
        Cylin ob=new Cylin();
        //ob.setradi(5);
        //ob.setheight(12); 
        System.out.println(ob.volume());
    }
}