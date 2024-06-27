/*3. In following game app, we have many types of monsters that can attack. We shall design a
superclass called Monster and define the method attack() in the superclass. The subclasses shall
then provides their actual implementation. In the main program, we declare instances of
superclass, substituted with actual subclass (Up casting); and invoke method defined in the
superclass*/
import java.util.*;
import java.lang.*;

class Monster
{
   String a="Monster";
   String attack()
   {
    return a;
   }
}
class FireMonster extends Monster
{
   String attack()
   {
     return "Fire .......";
   }
 }
 class WaterMonster extends Monster
 {
    String attack()
    {
       return "Water........";
     }
  }
 class StoneMonster extends Monster
 {
    String attack()
    {
       return "Stone.......";
     }
 }
 class Game
 {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       Monster f=new FireMonster();
       Monster w=new WaterMonster();
       Monster s=new StoneMonster();
        int x;
      do{
      System.out.println("Enter Option with what you want to attack\n1.Fire\n2.Water\n3.Stone\n4.Exit Game\n");
       x=sc.nextInt();
      switch(x) 
      {
         case 1:
            System.out.println(f.attack());
            break;
         case 2:
             System.out.println(w.attack());
             break;
          case 3:
              System.out.println(s.attack());
              break;
          default:
             System.out.println("Invalid");
        }
        }
        while(x!=0);
     }
  }
             
