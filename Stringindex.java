/*3. Write an application that uses String method indexOf to determine the total
number of occurrences of any given alphabet in a defined text.*/
import java.lang.*;
import java.util.*;
class Stringindex
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter String");
     String s1=sc.next();
     System.out.println("Enter character ");
     String a=sc.next();
     System.out.println(s1.indexOf(a));
  }
}
/*Enter String
Rgukt
Enter character 
k
3
*/
