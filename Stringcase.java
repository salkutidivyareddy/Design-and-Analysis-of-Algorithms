/*9. Write an application that changes any given string with uppercase letters,
displays it, changes it back to lowercase letters and displays it.*/
import java.lang.*;
import java.util.*;
class Create
 {
   String s;
   Create(String s)
   {
     this.s=s;
    }
   String changelCase(String s1)
   {
     return  this.s=s1.toLowerCase();//Changes the case in Object too this makes to update the Object
   }
   String changeuCase(String s1)
   {
     return  this.s=s1.toUpperCase();
   }
}
class Stringcase
{
  public static void main(String args[])
  {
    String s1;
    Scanner sc=new Scanner(System.in);
    s1=sc.next();
    Create c1=new Create(s1);
    System.out.println(c1.changelCase(c1.s));
    System.out.println(c1.changeuCase(c1.s));
   }
 }
 /*
 OoPs
oops
OOPS
*/
