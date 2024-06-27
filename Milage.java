/*4. Suggest the car for the journey.
Journey details : Travel to warangal with minimum possible fuel consumption & leat possible
Time.*/
import java.lang.*;
import java.util.*;
class Car
{
   String Company;
   int milage;
   double speed;
   String color;
   Car(String Company,int milage,double speed,String color)
   {
      this.Company=Company;
      this.milage=milage;
      this.speed=speed;
      this.color=color;
    }
   int getMilage()
   {
     return milage;
   }
   double getSpeed()
   {
     return speed;
    }
 }
 class Suggest
 {
    void Suggest(Car obj1,Car obj2,Car obj3)
    {
      if(obj1.milage<obj2.milage && obj1.milage<obj3.milage && obj1.speed>obj2.speed && obj1.speed>obj3.speed)
           System.out.println(obj1.Company);
       if(obj2.milage<obj3.milage && obj2.milage<obj1.milage && obj2.speed>obj3.speed && obj2.speed>obj1.speed)
          System.out.println(obj2.Company);
      if(obj3.milage<obj2.milage && obj3.milage<obj1.milage && obj3.speed>obj2.speed && obj3.speed>obj1.speed)
          System.out.println(obj3.Company);
     }
} 
        
class Milage
{
   public static void main(String args[])
   {
       Car c1=new Car("Ford",55,50,"Red");
       Car c2=new Car("Toyota",10,40,"Black");
       Car c3=new Car("volkswagon",3,300,"Yellow");
       System.out.println(c1.getSpeed());
       Suggest s=new Suggest();
       s.Suggest(c1,c2,c3);
     //  System.out.println(a);
     }

}

       


