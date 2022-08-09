import java.util.*;
class oop1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
    /*class Student
    {
        int rno;
        String name;
        
        Student()
        {
            this.rno=13;
            this.name="bony";
        }
        void greeting()
        {
            System.out.println("hello my name is "+ this.name);
        }
        void changename(String nn)
        {
            this.name=nn;
        }
    }
    Student shuv=new Student();
    shuv.changename("shubham");
    shuv.greeting();
    
   ..private...
    class Student
    {
        private int id;
        private String name;
        String getName()
        {
            return name;
        }
        void setName(String n)
        {
            name=n;
        }
        int getId()
        {
            return id;
        }
        void setId(int i)
        {
            id=i;
        }
    }
    Student shuv=new Student();
    shuv.setId(8);
    System.out.println(shuv.getId());
    shuv.setName("bony");
    System.out.println(shuv.getName());
    
   ...constructor....
   class Student
   {
       int id;
       String name;
       Student()
       {
          id=45;
          name="Shubham";
       }
       
   }
   Student shuv=new Student();
       System.out.println(shuv.id);
       System.out.println(shuv.name);
       */
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

