/*5. Write a Java program to print all vowels in given string and count number of
vowels and consonants present in given string*/
import java.lang.*;
import java.util.*;

class Vowels
{
  public static void main(String args[])
  {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");
    String s1=sc.next();
    Create c1=new Create(s1);
    c1.Check(c1.s,"aeiouAEIOU");
   }
 }
 class Create
 {
   String s;
   Create(String s)
   {
     this.s=s;
   }
   void Check(String s,String v)
   { int c=0;
     for(int i=0;i<s.length();i++)
     {
        if(v.indexOf(s.charAt(i))>=0)
         {
         c++;
         System.out.println(s.charAt(i));
         }
      }
      System.out.println("Length="+s.length());
      System.out.println("Vowels Count=" + c+"  "+"Consonent Count="+(s.length()-c));
    }
 }
/*Enter String
chandana
a
a
a
Length=8
Vowels Count=3  Consonent Count=5
*/
    
