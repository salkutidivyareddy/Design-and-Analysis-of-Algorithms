/*12. Write java program that inputs 5 numbers, each between 10 and 100 inclusive.
As each number is read display it only if it’s not a duplicate of any number already read
Display the complete set of unique values input after the user enters each new value.*/
import java.lang.*;
import java.util.*;
class Read
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     ArrayList<Integer>al=new ArrayList<Integer>(5);
     int k=0;
     System.out.println(al.size());
     while(true)
     {
       //Random r=new Random();
      // int id1=10+r.nextInt(100);
      int id1=sc.nextInt();
       int f=0;
       for(int i=0;i<al.size();i++)
       {
        System.out.println("Aray List"+al);
         int x=al.get(i);
         if(x==id1)
           f=1;
        }
        if(f==0){
          al.add(id1);
          k++;
        }
        else
          System.out.println("Duplicate");
        if(k==5)
         break;
      }
      System.out.println("Aray List"+al);
      al.clear();
      System.out.println(al);
   }
   
 }
          
