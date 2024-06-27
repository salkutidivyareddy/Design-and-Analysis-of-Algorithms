/*4. Write an application that uses String method concat to concatenate two defined
strings.*/
import java.util.*;
import java.lang.*;
class Create
{
  String s;
  Create(String ch)
  {
    s=ch;
 //   System.out.println(s);
   }
   void Combine(String s1,String s2)
   {
   //System.out.println(s1);
   System.out.println(s1.concat(s2));
   }
 }
class StringConcat
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("String1");
    String s1=sc.next();
    System.out.println("String2");
    String s2=sc.next();
    Create obj1=new Create(s1);
    Create obj2=new Create(s2);
    System.out.println(obj1.s);
    obj1.Combine(obj1.s,obj2.s);
  }
  }
/*
String1
OPPS
String2
LAB
OPPS
OPPSLAB*/

 
    
  
