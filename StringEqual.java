/*2. Write an application that uses String method equals and equalsIgnoreCase to
tests any two string objects for equality.*/
import java.lang.*;
import java.util.*;
class StringEqual
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter String1");
     String s1=sc.next();
     System.out.println("Enter String2");
     String s2=sc.next();
     System.out.println("Using equals Method");
     if((s1.equals(s2)))
      System.out.println("Equal");
     else
      System.out.println("Not Equal");
     System.out.println("Using equalsIgnoreCase Method");
       if((s1.equalsIgnoreCase(s2)))
      System.out.println("Equal");
     else
      System.out.println("Not Equal");
      
   }
 }
 /*Enter String1
OOPS
Enter String2
oops
Using equals Method
Not Equal
Using equalsIgnoreCase Method
Equal*/
