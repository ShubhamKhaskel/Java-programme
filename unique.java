import java.util.*;

    public class unique
    {
    String word;
    int len;
    unique()
    {
       this.word="";
       this.len=0;
    }
    public void acceptword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        this.word=sc.next().toUpperCase();
    }
    boolean checkunique()
    {
     len=word.length();   //to find the length
     if ((word.charAt(0) == 'A' || word.charAt(0) == 'E'|| word.charAt(0) == 'I'|| word.charAt(0) == 'O'|| word.charAt(0) == 'U' )&&(word.charAt(len-1) == 'A' || word.charAt(len-1) == 'E'|| word.charAt(len-1)== 'I'|| word.charAt(len-1)== 'O'|| word.charAt(len-1) == 'U' ))
     return true;
     else
     return false;
    }
    public void display()
    {
       System.out.println("The word= "+word);
       System.out.println(checkunique());
    }
    
    
    public static void main(String args[])
    {
       unique []a=new unique[5];//creating a new object array
       for(int i=0;i<5;i++) 
       {  
        a[i]=new unique(); //creating each object node for each array element
        a[i].acceptword();
       }
       for(int i=0;i<5;i++)
       {
         a[i].display();
         System.out.println();
       }
       
    }
}