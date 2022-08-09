import java.util.*;
class point
{
    int x;
    int y;
    point()
    {
        this.x=0;
        this.y=0;
    }
    void readpoint()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values of x and y");
        x=sc.nextInt();
        y=sc.nextInt();
    }
        /*point midpoint(point a,point b) 
        {
           int x1,x2,y1,y2;
           point ob=new point();
           x1=a.x;
           x2=b.x;
           y1=a.y;
           y2=b.y;
           ob.x=(x1+x2)/2;
           ob.y=(y1+y2)/2;
           return ob;
        }*/
   void midpoint(point a)
    {
        
       int x1,y1;
       x1=a.x;
       y1=a.y;
       x=(x1+x)/2;
       y=(y1+y)/2;
    }
    /*
       point midpoint(point a)
    {
        point ob3=new point();
        int x1,y1;
       x1=a.x;
       y1=a.y;
       ob3.x=(x1+x)/2;
       ob3.y=(y1+y)/2;
       return ob3;
    }*/
   /* point midpoint(point a,point b) 
    {
       int x1,x2,y1,y2;
       //point ob=new point();
       x1=a.x;
       x2=b.x;
       y1=a.y;
       y2=b.y;
       x=(x1+x2)/2;
       y=(y1+y2)/2;
       return this;
    }*/
    void displaypoint()
    {
       System.out.print(x);
       System.out.print(" . ");
       System.out.println(y);
    }
    /*public static void main(String args[])
    {
       point ob1=new point();
       point ob2=new point();
       ob1.readpoint();
       ob2.readpoint();
       point ob3=new point();
       //ob3=ob3.midpoint(ob1,ob2);
       ob3=ob1.midpoint(ob2);
       ob1.displaypoint();
       //ob2.displaypoint();
       ob3.displaypoint();
    }*/
    public static void main(String args[])
    {
       point ob1=new point();
       point ob2=new point();
       ob1.readpoint();
       ob2.readpoint();
       ob1.displaypoint();
       ob1.midpoint(ob2);
       ob2.displaypoint();
       ob1.displaypoint();
    }
}