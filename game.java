import java.util.*;
class game
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        class game1
        {
            int randomnumber;
            int guess;
            
            game1()
            {
                Random rand=new Random();
                this.randomnumber=rand.nextInt(101);   //0-100
            }
            
            public void ob1()
            {
                System.out.println("take another input");
                this.guess=sc.nextInt();
            }
            
            public int ob2()
            {
               if(guess==randomnumber)
               {
                   return 1;
               }
               else if(guess<randomnumber)
               {
                   return 2;
               }
               
                   return 3;
               
            }
        }
        
        game1 ob=new game1();
        ob.ob1();
        
        while(true)
        {
            if(ob.ob2()==1)
            {
                System.out.println("You win");
                break;
            }
            else if(ob.ob2()==2)
            {
                System.out.println("aro boro number nao");
                ob.ob1();
            }
            else if(ob.ob2()==3)
            {
                System.out.println("aro choto number nao");
                ob.ob1();
            }
        }
}
}