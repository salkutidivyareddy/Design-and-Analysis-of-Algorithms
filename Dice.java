/*13. Write a java program : rolling a pair of dices 10 times [ each attempt should be
delayed by 10000 ms ] and count number Successful attempts.
successful attempt : If the pair of Dice results in same values.*/
import java.util.*;
class Dice
{
   public static void main(String args[])
   {
     int s=0;
      Random r=new Random();
      for(int i=0;i<10;i++)
      {
         int d1=1+r.nextInt(6);
         int d2=1+r.nextInt(6);
         try{
         Thread.sleep(1000);
         }catch(InterruptedException e){
           System.out.println(e);
          }
         System.out.println(d1+" "+d2);
        
         if(d1==d2)
           s++;
      }
      System.out.println("Successful"+s);
     }
}
