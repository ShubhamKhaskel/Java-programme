import java.util.*;
class New19{
    String sent;
    int freq=0;
    New19()
    {
        
    }
    void input()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a sentence");
       sent=sc.nextLine()+" ";
    }
    boolean isCap(String sent)
    {
            if(Character.isUpperCase(sent.charAt(0)))
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    void display()
    {
        int i=0;
        boolean q;
        String s="";
        for(i=0;i<sent.length();i++)
        {
            
            if(sent.charAt(i)!=' ')
            {
               s=s+sent.charAt(i);
            }
            else
            {
            q=isCap(s);
            if(q==true)
            {
            freq=freq+1;
            }
            s="";
            }
            
        }
            System.out.println(sent);
            System.out.println(freq);
    }
    public static void main(String args[])
    {
       int n;
       Scanner sc = new Scanner(System.in);
       New19 ob= new New19();
       ob.input();
       ob.display();
                     
           
       }
       
       
    }
