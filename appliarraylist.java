import java.util.*;
class appliarraylist
{
    public static void func1(String s,int k)
    {
        String smallest="";
        String largest="";
        
        ArrayList<String> a=new ArrayList<String>();
        
        for(int j=0;j<s.length()-k+1;j++)
        {
            a.add(s.substring(j,j+k));
        }
        Collections.sort(a);
        smallest=a.get(0);
        largest=a.get(a.size()-1);
        
        System.out.println(largest);
        System.out.println(smallest);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        func1(s,k);
    }
}