import java.util.*;
class guessgame{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
            class game
       {
           int guess;
           int random;
           game()
          {
           Random rand=new Random();
           this.random=rand.nextInt(100)+1;
          }
          void a1()
          {
              System.out.println("enter your guess (1-100)");
              this.guess=sc.nextInt();
          }
          int a2()
          {
            if(this.guess==this.random)
           {
               return 0;
           }
           else if(this.guess<this.random)
           {
               return 1;
           }
           else
           {
               return 2;
           }  
          }
        }
    game ob=new game();
    ob.a1();
    while(true)
    {
            if(ob.a2()==0)
        {
            System.out.println("YOU WIN");
            break;
        }
        
        else if(ob.a2()==2)
        {
            System.out.println("YOUR GUESSED NO IS GREATER ");
            ob.a1();
        }
        else if(ob.a2()==1)
        {
            
            System.out.println("YOUR GUESSED NO IS LESS ");
            ob.a1();
        }
   }
   } 
}