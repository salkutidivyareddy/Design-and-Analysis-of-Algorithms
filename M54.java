/*
4. Create an Interface Fare with methods getFare(), getAmenities() to get the
amount paid for Travelling and Amenities provided in journey. Calculate the fare
paid and Amenities provided in Bus, Train and Flight implementing interface Fare.
Note :The Fare per Kilometer is different for Road and Rail and airways and even
the fare changes as per type of Bus (A/c, Non A/c, sleeper, semi sleeper etc.,)
Train( General, Sleeper, A/c), Flight (Economy/Business class) . Make necessary
assumptions on distance travelled etc.,.
*/
import java.util.*;
interface Fare
{
   void getFare(String c,int x);
   void getAmenities();
}
class Bus implements Fare
{
 
    Scanner sc=new Scanner(System.in);
  public  void getFare(String t,int x)
    {
        System.out.println("Welcome to Bus Travelling Agency");
      if(t.equalsIgnoreCase("A/c")){
       System.out.println("Enter Fare per kilometer In "+" "+t);
       int k=sc.nextInt();
        System.out.println("Fare Paid="+x*k);
       }
      if(t.equalsIgnoreCase(" Non A/c")){
       System.out.println("Enter Fare per kilometer In "+" "+t);
       int k=sc.nextInt();
        System.out.println("Fare Paid="+x*k);
       }
      if(t.equalsIgnoreCase("Sleeper")){
      System.out.println("Enter Fare per kilometer In "+" "+t);
       int k=sc.nextInt();
        System.out.println("Fare Paid="+x*k);
       }
     }
   public void getAmenities()
    {
      System.out.println("Food Provided\nTV Available\n Safe Journey");
    }
}
class Train implements Fare
{
  Scanner sc=new Scanner(System.in);
  public  void getFare(String t,int x)
    {
      System.out.println("Welcome to Train Travelling Agency");
      if(t.equalsIgnoreCase("A/c")){
        System.out.println("Enter Fare per kilometer In "+" "+t);
       int k=sc.nextInt();
        System.out.println("Fare Paid="+x*k);
      }
      if(t.equalsIgnoreCase("General")){
      System.out.println("Enter Fare per kilometer In "+" "+t);
       int k=sc.nextInt();
        System.out.println("Fare Paid="+x*k);
        }
      if(t.equalsIgnoreCase("Sleeper")){
        System.out.println("Enter Fare per kilometer In "+" "+t);
       int k=sc.nextInt();
        System.out.println("Fare piad= "+x*k);
      }
     }
   public void getAmenities()
    {
      System.out.println("Food Provided\nTV Available\n Safe Journey");
    }
}
class Flight implements Fare
{
   Scanner sc=new Scanner(System.in);
 //  System.out.println("Welcome to Flight Travelling Agency");
   public void getFare(String t,int x)
    {
      if(t.equalsIgnoreCase("Business")){
        System.out.println("Enter Fare per kilometer In "+" "+t);
       int k=sc.nextInt();
        System.out.println("Fare Paid="+k*x);
       }
      if(t.equalsIgnoreCase(" Economy")){
      System.out.println("Enter Fare per kilometer In "+" "+t);
       int k=sc.nextInt();
        System.out.println("Fare Paid="+k*x);
      }
     
     }
   public void getAmenities()
    {
      System.out.println("Food Provided\nTV Available\n Safe Journey");
    }
}
class M54
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Bus type");
     String c=sc.next();
     System.out.println("Enter Numer of Kilometers");
     int x=sc.nextInt();
     Bus b=new Bus();
     b.getFare(c,x);
     b.getAmenities();
     System.out.println("Enter Train type");
      c=sc.next();
     System.out.println("Enter Numer of Kilometers");
      x=sc.nextInt();
     Train t=new Train();
     t.getFare(c,x);
     t.getAmenities();
     System.out.println("Enter Flight type");
      c=sc.next();
     System.out.println("Enter Numer of Kilometers");
      x=sc.nextInt();
     Flight f=new Flight();
     f.getFare(c,x);
     f.getAmenities();
    }
}
     
     
     
     
     


     
