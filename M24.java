/*4. Suggest the car for the journey.
Journey details : Travel to warangal with minimum possible fuel consumption & leat possible
Time.*/
import java.util.*;
class Car
{
   String Company;
   double Mileage;
   double Speed;
   String color;
   Car(String C,double m,double s,String col)
   {
      Company=C;
      Mileage=m;
      Speed=s;
      color=col;
   }
  double getMileage()
  {
    return Mileage;
  }
  double getSpeed()
  {
    return Speed;
  }
  String getCompany()
  {
      return Company;
   }
  String getColor()
  {
     return color;
   }
}
class M24
{
   public static void main(String args[])
   {
       Car ob1=new Car("Ford",20,10,"red");
       Car ob2=new Car("Toyota",30,20,"Green");
       Car ob3=new Car("Volkswagon",60,30,"Black");
     
    if(ob1.Mileage>ob2.Mileage && ob1.Mileage>ob3.Mileage)
      {
        System.out.println("Car:"+ob1.getCompany()+" "+ob1.getMileage());
      }
      if(ob2.Mileage>ob1.Mileage && ob2.Mileage>ob3.Mileage)
      {
        System.out.println("Car:"+ob2.getCompany()+" "+ob2.getMileage());
      }
      if(ob3.Mileage>ob2.Mileage && ob3.Mileage>ob1.Mileage)
      {
        System.out.println("Car:"+ob3.getCompany()+" "+ob3.getMileage());
      }
    }
}

   

