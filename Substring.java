/*8. Write an application that finds the substring from any given string using
substring method and startsWith & endsWith methods.*/
import java.lang.*;
import java.util.*;
class Substring
{
  public static void main(String args[])
  {
     String s1;
     System.out.println("Enter String");
     Scanner sc=new Scanner(System.in);
     s1=sc.next();
     System.out.println("Enter Starting and ending charecter of SubString");
     char a=sc.next().charAt(0);
     char b=sc.next().charAt(0);
     int c=s1.indexOf(a);
     int d=s1.indexOf(b);
     System.out.println(c + " " + d);
     Create obj1=new Create(s1);
     String s2=obj1.find(obj1.s,c,d+1);
     if(c<d)
     System.out.println(s2);
     else
      System.out.println("Not Available");
   }
}
class Create
{
   String s;
   Create(String s)
   {
     this.s=s;
   }
   String find(String s1,int a,int b)
   {
      return s1.substring(a,b);
    }
 }
/*
Enter String
chandana
Enter Starting and ending charecter of SubString
h
d
1 4
hand
*/
