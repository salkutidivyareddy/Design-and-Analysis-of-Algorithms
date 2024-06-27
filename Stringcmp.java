/*1. Write an application that uses String method compareTo to compare two strings
defined by the user.*/
import java.lang.*;
import java.util.*;
class Stringcmp
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter String1");
     String s1=sc.next();
     System.out.println("Enter String2");
     String s2=sc.next();
     Equal obj1=new Equal(s1);
     Equal obj2=new Equal(s2);
     obj1.checkEqual(obj1.s,obj2.s);
    /* if((s1.compareTo(s2))==0)
      System.out.println("Equal");
     else
      System.out.println("Not Equal");
      */
   }
 }
 class Equal
 {
   String s;
   Equal(String ch)
   {
     this.s=ch;
    }
     void checkEqual(String ch1,String ch2)
    {
      if((ch1.compareTo(ch2))==0)
      System.out.println("Equal");
      else
       System.out.println("Not Equal");
     }
}
/*
Enter String1
chandana
Enter String2
chandana 
Equal  

Enter String1
oops
Enter String2
oop
Not Equal*/
