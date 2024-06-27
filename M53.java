/*
3. Create an interface Vehicle with methods getCompany(),getModel(),getType()(
Petrol/Diesel/CNG) and getConsumption(), display Company and Model, type and
calculate the fuel consumed by Two wheelers and Four Wheelers by
implementing interface Vehicle.
Note : Mileage for 4-wheeler is 14km/Ltr(petrol), 22km/Ltr(Diesel),
18km/kg(CNG). And for 2- wheeler is 62km/Ltr(petrol) 82km/ltr(Diesel),72km/ltr
(cng).
*/
import java.util.*;
interface Vehicle
{
    String getCompany(String a);
    String getModel(String b);
    String getType(String x);
    void getConsumption(String type,int x);
}
class TwoWheeler implements Vehicle
{
   /* String Company,Model,type;
   Twowheeler(String c,String M,String t)
   {
      Company=c;
      Model=M;
      type=t;
    }*/
   
   public String getCompany(String Company)
   {
     return Company;
   }
 public  String getModel(String Model)
   {
     return Model;
   }
  public String getType(String type)
   {
      return type;
    }
 public  void getConsumption(String type,int x)
   {
      if((type).equalsIgnoreCase("Petrol"))
          {
            System.out.println("Petrol Consumption for Two Wheelers of Distance  ="+x+"is\t"+x/62);
          }
       if((type).equalsIgnoreCase("Diesel"))
          {
            System.out.println("Diesel Consumption for Two Wheelers of Distance  ="+x+"is"+x/82);
          }
        if((type).equalsIgnoreCase("cng"))
          {
            System.out.println("CNG Consumption for Two Wheelers of Distance  ="+x+"is"+x/72);
          }
     }
 }
class FourWheeler implements Vehicle
{
    String Company,Model,type;
   /*FourWheeler(String c,String M,String t)
   {
      Company=c;
      Model=M;
      type=t;
    }*/
   
   public String getCompany(String Company)
   {
     return Company;
   }
  public String getModel(String Model)
   {
     return Model;
   }
  public String getType(String type)
   {
      return type;
    }
  public void getConsumption(String type,int x)
   {
      if((type).equalsIgnoreCase("Petrol"))
          {
            System.out.println("Petrol Consumption for Two Wheelers of Distance  ="+x+"is"+x/14);
          }
       if((type).equalsIgnoreCase("Diesel"))
          {
            System.out.println("Diesel Consumption for Two Wheelers of Distance  ="+x+"is"+x/22);
          }
        if((type).equalsIgnoreCase("cng"))
          {
            System.out.println("CNG Consumption for Two Wheelers of Distance  ="+x+"is"+x/18);
          }
     }
 }
 class M53
 {
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Company,Model and Type of Vehicle");
     String c=sc.next();
     String m=sc.next();
     String ty=sc.next();
     TwoWheeler t=new TwoWheeler();
     FourWheeler f=new FourWheeler();
     System.out.println("Comany:"+t.getCompany(c)+"\n"+"Model:"+t.getModel(m)+"\n"+"Type:"+t.getType(ty));
     System.out.println("Enter How many Kilometers it Travelled to calculate how many  Litres consumped");
     int x=sc.nextInt();
     t.getConsumption(ty,x);
     f.getConsumption(ty,x);
     
    }
}
       
         
   
   
    
