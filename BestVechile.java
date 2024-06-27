/*
4. RGUKT planned to provide vehicles (2 and 4 wheelers) to all class CR’s, and requested the
company name and model of 2 and 4 wheelers from CR’s. As Indian market has lot of models
in 2 wheelers and 4 wheelers, Mr. Ramesh is in dilemma to choose the best model among all 2
wheelers and 4 wheelers.
Write an application which compares the best model among 2 wheelers and 4 wheelers.
Create a super class Vehicle, derive the sub-classes TwoWheeler and FourWheeler .
Two wheeler can have properties such as Company, Model, Mileage, Fuel Capacity,
Displacement, Front Brake, Rear Brake, Tyre Type, Head lamp, User Reviews
Four wheeler can have properties such as Company, Model, Mileage, Fuel Capacity,
Displacement, Air Conditioner, air bags, Power Steering, Rain Sensing Wiper.
Maintain atleast four 2-wheelers and Four 4-wheelers details in repository.
Application usage : Display all companies and models of 2 and 4 wheelers available in
repository. User can choose any number of vehicles to compare, compare among them and
display the Company and model of the vehicle to buy. If user opted for 2 wheeler, compare only
2 wheeler vehicles and same with 4 wheeler.*/
import java.util.*;
import java.lang.*;
class Vehicle
{
    String Company;
    String Model;
    double Mileage;
    double fuelCapacity;
    int Displacement;
   /* Vehicle(String c,String M,double mi,double f,int d)
    {
       this.Company=c;
       this.Model=M;
       this.Mileage=mi;
       this.fuelCapacity=f;
       this.Displacement=d;
      }*/
 }
 class TwoWheeler extends Vehicle
 {
    String FrontBreak,rearBreak,Headlamp;
    String Tyretype,Userreviews;
    TwoWheeler(String C,String M,double Mi,double f,int Dis,String Fb,String rB,String tyt,String Hlp,String Ur)
    {
         //super.Vehicle(C,M,Mi,f,Dis);
        this.FrontBreak=Fb;
        this.rearBreak=rB;
        this.Headlamp=Hlp;
        this.Tyretype=tyt;
        this.Userreviews=Ur;
       
     }
     void show(TwoWheeler t[])
     {
        for(int i=0;i<4;i++)
        {
           System.out.println("User Revies" + t[i].Userreviews);
        }
     }
 }
 class FourWheeler extends Vehicle
 {
    Boolean AirConditioner, airbags, PowerSteering, RainSensingWiper;
    FourWheeler(String C,String M,float Mi,float f,int Dis,Boolean ac,Boolean ab,Boolean ps,Boolean w)
    {
       this.AirConditioner=ac;
       this.airbags=ab;
       this.PowerSteering=ps;
       this.RainSensingWiper=w;
     // super.Vehicle(C,M,Mi,f,Dis);
    }
  }
class BestVechile
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       TwoWheeler[] t;
       t=new TwoWheeler[4];
       FourWheeler f[]=new FourWheeler[4];
       t[0].TwoWheeler("xsg","dol",6.2,9.0,50,"True","True","tt","True","Good");
       t[1].TwoWheeler("xgrer4","dol",6.2,29.0,50,"True","True","tt","True","Bettter");
       t[2].TwoWheeler("xfgsr","dol",6.2,29.0,50,"True","True","tt","True","worst");
       t[3].TwoWheeler("xgws4","dol",6.2,29.0,50,"True","True","tt","True","best");
       t[0].show(t);
    }
 }
       
       
       
       
