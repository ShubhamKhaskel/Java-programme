import java.util.*;
interface Camera
{
    void takeSnap();
    void recordvdo();
    default void mmm()
    {
       System.out.println("pagluuuuuu.... "); 
    }
}
interface Wifi
{
    String[] getNetworks();
    void connect(String network);
}
class Mycell
{
    void callNumber(int phoneNumber)
    {
       System.out.println("...Calling..."+phoneNumber); 
    }
    void pickcall()
    {
       System.out.println("...Connecting..."); 
    }
}
class Mysmart extends Mycell implements Wifi,Camera 
{
    public void takeSnap()
    {
        System.out.println("Taking snap");
    } 
    public void recordvdo()
    {
        System.out.println("recorrrrrddddd");
    } 
    public String[] getNetworks()
    {
      //System.out.println("Getting list of networks");
      String[] networklist={"shuv","bony","arka"};
      return networklist;
    }
    public void connect(String network)
    {
        System.out.println("CONNECT -->"+network);
    } 
}
public class interface1
{
    public static void main(String args[])
    {
       Mysmart ob=new Mysmart();
       String a[]=ob.getNetworks();
       for(int i=0;i<a.length;i++)
       {
           System.out.print(a[i]+" ");
       }
       
    }
}