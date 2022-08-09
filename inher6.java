import java.util.*;
class func
{
    int userid;
    String emailid;
    String name;
    String city;
    func(int userid,String emailid,String name,String city)
    {
        this.userid=userid;
        this.emailid=emailid;
        this.name=name;
        this.city=city;
    }
    public void show()
    {
        System.out.println("Userid="+userid);
        System.out.println("emailid="+emailid);
        System.out.println("name="+name);
        System.out.println("city="+city);
    }
}
public class inher6
{
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        func ob1=new func(1001,"abc@gmail.com","Harry","Bangalore");
        func ob2=new func(1002,"bony@gmail.com","Digby","Delhi");
        func ob3=new func(1003,"shubham@gmail.com","Shubham","Chennai");
        func ob4=new func(1004,"arka@gmail.com","Arka","Kochi");
        func ob5=new func(1005,"subhramoy@gmail.com","Subhramoy","Bangalore");
        String s;
        s=sc.next();
        int flag1=0,flag2=0,flag3=0,flag4=0,flag5=0;
        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j)==ob1.city.charAt(j))
            {
                flag1++;
            }
            if(s.charAt(j)==ob2.city.charAt(j))
            {
                flag2++;
            }
            if(s.charAt(j)==ob3.city.charAt(j))
            {
                flag3++;
            }
            if(s.charAt(j)==ob4.city.charAt(j))
            {
                flag4++;
            }
            if(s.charAt(j)==ob5.city.charAt(j))
            {
                flag5++;
            }
        }
        if(flag1==ob1.city.length())
        {
            ob1.show();
        }
        else if(flag2==ob2.city.length())
        {
            ob2.show();
        }
        else if(flag3==ob3.city.length())
        {
            ob3.show();
        }
        else if(flag4==ob4.city.length())
        {
            ob4.show();
        }
        else if(flag5==ob5.city.length())
        {
            ob5.show();
        }
        else
        {
            System.out.println("Not Found");
        }
    }
}