import java.util.*;
     class libraryprog
{   public static void main(String args[])
  { 
    Scanner sc=new Scanner(System.in); 
    class Library
    {
        String books[];
        int no_of_books=0;
        Library()
        {
            this.books=new String[100];
            this.no_of_books=0;
        }
        void addbook(String book)
        {
            this.books[no_of_books]=book;
            no_of_books++;
            System.out.println(book +" has been added!");
        }
        void showAvailableBooks()
        {
            int i;
            System.out.println("Available Books are:");
            for(i=0;i<no_of_books;i++)
            {
                if(books[i]==null)
                continue;
                else
                System.out.println("* "+books[i]);
            }
        }
        void issueBook(String book)
        {
            int i;
            for(i=0;i<no_of_books;i++)
            {
                if(book.equals(books[i]))
                {
                  System.out.println(books[i]+" IS ISSUED");  
                  books[i]=null;
                }
                else
                continue;
            }
        }
        void returnBook(String book)
        {
            books[no_of_books++]=book;
            this.no_of_books=no_of_books++;
            
        }
    }
    int i;
    Library ob=new Library();
    for(i=0;i<3;i++)
    {
    ob.addbook(sc.next());
    }
    ob.showAvailableBooks();
    ob.issueBook("poty");
    ob.showAvailableBooks();
    ob.returnBook("shuv");
    ob.showAvailableBooks();
  }
}