import java.util.*;

    public class unique1
    {
    String word;
    int len;
    unique1(String wd)
    {
       this.word=wd;
       this.len=0;
    }
    boolean check()
    {
        len=word.length(); 
        for(int i=0;i<len-1;i++)
        {
            char x=word.charAt(i);
            if(word.indexOf(x,i+1)>=0)//indexOf returns position index  
            return true;
            /*for(int j=i+1;j<len;j++)
            {
                if(word.charAt(i)==word.charAt(j))
                return true;//true if duplicate letters found
            }*/
        }
        return false;
    }
    public void display()
    {
       System.out.println("The word= "+word);
       System.out.println(check());
    }
    
    
    public static void main(String args[])
    {
        unique1 ob=new unique1("ABCD");
        ob.display();
       
    }
}