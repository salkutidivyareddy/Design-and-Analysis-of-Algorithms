/*.7. Write an application that uses String method charAt to reverse the string.*/
import java.lang.*;
import java.util.*;
class Stringrev
{
  public static void main(String args[])
  {
    String s1;
    Scanner sc=new Scanner(System.in);
    s1=sc.next();
    int l=s1.length();
    Create c1=new Create(s1);
    System.out.println(c1.reverse(c1.s,l));
    
   }
 }
 class Create
 {
   String s;
   Create(String s)
   {
     this.s=s;
    }
   String reverse(String s1,int l)
   {
     
    String rev="";
     for(int i=l-1;i>=0;i--)
     {
       
       rev=rev+s1.charAt(i);
       
      } 
      return rev;    
   }
 }
 /*
 CHANDANA
ANADNAHC
*/
