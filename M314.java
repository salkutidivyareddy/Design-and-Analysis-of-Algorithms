/*
14. Implement the following case study using OOP concepts in Java.
E-Book stall :
Every book has Properties which includes : Book _Name, Book_Author, Book_Count ;
Every Customer is having properties as : Customer_Id, Customer_Name,
Customer_Address and he can buy Books from E-Book stall.
Write a Program which will display the text book name and the remaining count of text
books when a customer buys a text book.
*/
import java.util.*;
class Book
{
   String Book_Name,Book_Author;
   int Book_count;
   Book(String bn,String ba,int n)
   {
      Book_Name=bn;
      Book_Author=ba;
      Book_count=n;
    }
    
  void sell(int x)
  {
     System.out.println("Book Name:"+Book_Name);
     System.out.print("\nRemaining Book Count=");
     System.out.println(Book_count-x);
     Book_count=Book_count-x;
   }
}
class Customer
{
   String Customer_id,Customer_Name,Customer_Address;
   Customer(String ci,String cn,String ad)
   {
      Customer_id=ci;
      Customer_Name=cn;
      Customer_Address=ad;
    }
 }
 class M314
 {
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      Book b1=new Book("OOPS","Abc",7);
      Book b2=new Book("FLAT","abg",10);
      Book b3=new Book("AI","xssx",9);
      System.out.println("Enter Customer_id,name and Address");
      String n=sc.next();
      String i=sc.next();
      String j=sc.next();
      Customer c=new Customer(n,i,j);
      System.out.println("Enter\n1.OOPS\n2.FLAT\n3.AI");
      int x=sc.nextInt();
      System.out.println("Enter Number of Books");
      int y=sc.nextInt();
      if(x==1)
        b1.sell(y);
      if(x==2)
         b2.sell(y);
       if(x==3)
         b3.sell(y);
    }
 }
      
