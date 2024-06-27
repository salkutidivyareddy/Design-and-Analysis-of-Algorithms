/*1. Write a Java program that reads a numeric input from the user. Call the input
method in a try block and catch the specific exception that the input method would
throw if the user entered a non-numeric input.
Hint : import java.util.InputMismatchException
*/
import java.util.*;
import java.lang.*;
import java.util.InputMismatchException;
class M71
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      try{
      System.out.println("Enter Number:");
      int x=sc.nextInt();
      System.out.println("Correct");
     
     }
     catch(InputMismatchException a)
     {
        System.out.println(a);		
        System.out.println("Mismatch");
      }
     finally{
      sc.close();
      } 
     
    }
  }

