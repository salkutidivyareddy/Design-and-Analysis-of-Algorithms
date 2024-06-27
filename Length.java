/*6. Write an application that finds the length of a given string.*/
import java.lang.*;
import java.util.*;

class Length
{
   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   String s1=sc.next();
   Create c1=new Create(s1);
   int l=c1.getLength(c1.s);
   System.out.println(l);
   }
 }
 class Create
 {
   String s;
   Create(String s)
   {
     this.s=s;
    }
   int getLength(String s1)
   {
    
     int l= s1.length();
     return l;
   }
 }
/*RguktBasar
10
*/
