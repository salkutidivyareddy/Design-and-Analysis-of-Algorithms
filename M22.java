/*
2. Switch on/off the led light and switch on/off the halogen light.
Note : turnOn()/turnOff() will print the state of light as On/Off.
*/
import java.util.*;
class Lamp
{
   String type;
   Boolean isOn;
   Lamp(String ty ,Boolean t)
   {
     isOn=t;
     type=ty;
   }
  void turnOn()
  {
    if((Boolean.compare(true,isOn))==0)
      System.out.println("Alread Light TurnOn()");
    else
      {
         isOn=true;
         System.out.println("On");
       }
    }
   void turnOff()
  {
    if((Boolean.compare(false,isOn))==0)
      System.out.println("Alread Light TurnOff()");
    else
      {
         isOn=true;
         System.out.println("Off");
       }
    }
 }
 class M22
 {
   public static void main(String args[])
   {
      Lamp l1=new Lamp("Led",true);
      Lamp l2=new Lamp("Halogen",false);
      l1.turnOn();
      l1.turnOff();
      l2.turnOff();
      l2.turnOn();
   }
 }
