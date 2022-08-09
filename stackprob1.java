import java.util.*;
class stackprob1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char[] a=new char[100];
        Stack<Character> stk=new Stack<>();
        String s=sc.nextLine();
        int len=0;
        for(int i=0;i<s.length();i++)
        {
            a[i]=s.charAt(i);
            len++;
        }
        
        for(int j=0;j<len;j++)
        {
           stk.push(a[j]); 
        }
        
        for(int j=0;j<len;j++)
        {
            System.out.print(stk.get(j)+"->");
        }
        
        for(int j=0;j<len;j++)
        {
            a[j]=stk.peek();
            stk.pop();
        }
        
        System.out.println();
        
        for(int j=0;j<len;j++)
        {
            System.out.print(a[j]+"->");
        }
        System.out.println();
        
        String c="";
        for(int j=0;j<len;j++)
        {
            c=c+a[j];
        }
        
        System.out.println(c);
    }
}