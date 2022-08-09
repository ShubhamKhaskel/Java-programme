import java.util.*;
class new11
{
    public static void main(){
        int i,l,t=0,j,flag=0;
        char x,y;
        String s="",n="ronaldo",q="messi",h="greatest",p="prominent",sw="";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String w=sc.nextLine().toLowerCase().trim()+" ";
        for(i=0;i<w.length();i++)
        {
          x=w.charAt(i);
          
          if(x!=' ')
          {
            s=s+x;
          }
          else
          {
              if(s.equals(n)==true)
              {
                  s=q;
              }
              else if(s.equals(h)==true)
              {
                  s=p;
              }  
          
          sw=sw+s+" "; 
          s="";
        }
        
    }
        System.out.println(sw);
        }
        
        
    }

