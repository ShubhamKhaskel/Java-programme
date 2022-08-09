import java.util.*;
class box
{
    double l;
    double b;
    double volume;
   box()
   {
      this.l=5;
      this.b=6;
      this.volume=(this.l)*(this.b);
   }
   box(int l)
   {
       this.l=l;
       this.b=2;
       this.volume=(this.l)*(this.b);
   }
   box(int l,int b)
   {
       this.l=l;
       this.b=b;
       this.volume=(this.l)*(this.b);
   }
   box(double l,double b)
   {
       this.l=l;
       this.b=b;
       this.volume=(this.l)*(this.b);
   }
}
public class colez
{
    public static void main(String args[])
    {
       box ob1=new box();
       box ob2=new box(3);
       box ob3=new box(4,5);
       box ob4=new box(3.0,7.0);
       System.out.println(ob1.volume);
       System.out.println(ob2.volume);
       System.out.println(ob3.volume);
       System.out.println(ob4.volume);
       
       double[] a=new double[4];
       a[0]=ob1.volume;
       a[1]=ob2.volume;
       a[2]=ob3.volume;
       a[3]=ob4.volume;
       
       double temp;
       for(int i=0;i<4-1;i++)
       {
           for(int j=0;j<4-1-i;j++)
           {
               if(a[j]>a[j+1])
               {
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
               }
           }
       }
       for(int i=0;i<4;i++)
       {
           System.out.print(a[i]+"...");
       }
    }
}