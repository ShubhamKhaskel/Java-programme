import java.util.*;
class stackproblem
{
   boolean isOpening(char c)
   {
       if(c=='('||c=='{'||c=='[')
        return true;
        else
        return false;
   }
   boolean isMatching(char a,char b)
   {
       if((a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']'))
       {
           return true;
       }
       else
       return false;
   }
   boolean isParenthesisMatching(String str)
   {
       Stack<Character> s=new Stack<>();
       for(int i=0;i<str.length();i++)
       {
          char cur=str.charAt(i);
          if(isOpening(cur)==true)
          {
              s.push(cur);
          }
          else
          {
              if(s.isEmpty())
              {
                  return false;
              }
              else if(!isMatching(s.peek(),cur))
              {
                  return false;
              }
              else
              {
                  s.pop();
              }
          }
       }
       if(s.isEmpty())
       {
           return true;
       }
       else
       {
           return false;
       }
   }
   public static void main(String args[])
   {
       String s;
       Scanner sc=new Scanner(System.in);
      
         s=sc.next();
         stackproblem ob=new stackproblem();
         boolean f=ob.isParenthesisMatching(s);
         if(f==true)
         {
             System.out.println("True parenthesis");
         }
         else
         {
            System.out.println("False parenthesis"); 
         }
   }
}