/*
3. Create an interface Vehicle with methods getCompany(),getModel(),getType()(
Petrol/Diesel/CNG) and getConsumption(), display Company and Model, type and
calculate the fuel consumed by Two wheelers and Four Wheelers by
implementing interface Vehicle.
Note : Mileage for 4-wheeler is 14km/Ltr(petrol), 22km/Ltr(Diesel),
18km/kg(CNG). And for 2- wheeler is 62km/Ltr(petrol) 82km/ltr(Diesel),72km/ltr
(cng).*/
import java.lang.*;
import java.util.*;

interface Vehicle
{
    String getCompany();
    String getModel();
    String getType();
    double getConsumption(int x);
 }
 class TwoWheelers implements Vehicle
 {
  int m=62;
   public String getCompany()
    {
      return "Bajaj";
     }
    public String getModel()
    {
       return "Pulsar NS200";
     }
   public  String getType()
    {
      return "Petrol";
     }
 public double getConsumption(int x)
    {
      return  x/m;
     }
 }
 class FourWheelers implements Vehicle
 {
  int m=14;
   public String getCompany()
    {
      return "Bajaj";
     }
    public String getModel()
    {
       return " Qute (RE60)";
     }
     public String getType()
    {
      return "Diesel";
     }
  public double getConsumption(int x)
    {
      return  x/m;
     }
 }
class IntefaceEx
{
   public static void main(String args[])
   {
      
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter Distance");
      int x=sc.nextInt();
      TwoWheelers t=new TwoWheelers();
      FourWheelers f=new FourWheelers();
       System.out.println("Two Wheeler");
      System.out.println(t.getCompany());
      System.out.println(t.getModel());
      System.out.println(t.getType());
       System.out.println(t.getConsumption(x)+"Kmph"); 
      System.out.println("Four Wheeler");
       System.out.println(f.getCompany());
      System.out.println(f.getModel());
      System.out.println(f.getType());
       System.out.println(f.getConsumption(x)+"Kmph"); 
      }
   }
   
      


