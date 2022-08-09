import java.util.*;
class new10
{
    public static void main(){
        int i,l,t=0,j,flag=0;
        char x,y;
        String s="";
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
              for(j=0;j<s.length();j++)
              {
                  if(s.charAt(j)==s.charAt(s.length()-1-j))
                  {
                     flag=1; 
                  }
                  else
                  {
                      flag=0;
                  }
              }
              if(flag==1)
              {
                System.out.println(s);
              }
              s="";
          }
          
        }
        
    }
}
