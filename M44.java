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
2 wheeler vehicles and same with 4 wheeler.
*/
import java.util.*;

class Vehicle
{
    String Company;
    String Model;
    double Mileage;
    double fuelCapacity;
    int Displacement;
   Vehicle(String c,String M,double mi,double f,int d)
    {
       this.Company=c;
       this.Model=M;
       this.Mileage=mi;
       this.fuelCapacity=f;
       this.Displacement=d;
      }
 }
 class TwoWheeler extends Vehicle
 {
    Boolean FrontBreak,rearBreak,Headlamp;
    String Tyretype,Userreviews;
    TwoWheeler(String C,String M,double Mi,double f,int Dis,Boolean Fb,Boolean rB,String tyt,Boolean Hlp,String Ur)
    {
        super(C,M,Mi,f,Dis);
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
           System.out.println("Comapny:" + t[i].Company +" "+"Model:" +t[i].Model);
        }
     }
     void Compare(TwoWheeler t[],int a[],int n)
     {
       int index=0;
       double c=0;
       for(int i=0;i<n;i++)
       {
          int x=a[i];
         if(t[x].Mileage>c){
           c=t[x].Mileage;
           index=x;
         }
       }
       System.out.println("Buy This Vehicle with High Mileage\n"+t[index].Company+" "+t[index].Model);
     }
         
 }
 class FourWheeler extends Vehicle
 {
    Boolean AirConditioner, airbags, PowerSteering, RainSensingWiper;
    FourWheeler(String C,String M,float Mi,float f,int Dis,Boolean ac,Boolean ab,Boolean ps,Boolean w)
    {
      
      super(C,M,Mi,f,Dis);
       this.AirConditioner=ac;
       this.airbags=ab;
       this.PowerSteering=ps;
       this.RainSensingWiper=w;
     // super.Vehicle(C,M,Mi,f,Dis);
    }
  }
class M44
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       TwoWheeler[] t;
       t=new TwoWheeler[4];
       FourWheeler f[]=new FourWheeler[4];
       t[0]= new TwoWheeler("xsg","dol",6.2,9.0,50,true,true,"tt",true,"Good");
       t[1]= new TwoWheeler("xgrer4","dol",6.2,29.0,50,true,true,"tt",true,"Bettter");
       t[2]= new TwoWheeler("xfgsr","dol",8,29.0,50,true,true,"tt",true,"worst");
       t[3]= new TwoWheeler("xgws4","dol",6.2,29.0,50,true,true,"tt",true,"best");
       t[0].show(t);
       /*f[0].TwoWheeler("Fgf","dol",6.2,9.0,50,true,true,"tt",true,"Good");
       f[1].TwoWheeler("BBBB","dol",6.2,29.0,50,true,true,"tt",true,"Bettter");
       f[2].TwoWheeler("CCCC","dol",6.2,29.0,50,true,true,"tt",true,"worst");
       f[3].TwoWheeler("GGGGG","dol",6.2,29.0,50,true,true,"tt",true,"best");
       f[0].show(t);*/
       System.out.println("Enter Number of Two wheelers to Compare");
       int c=sc.nextInt();
       int a[]=new int[c];
       System.out.println("Enter Number of Two wheelers that are Displayed");
       for(int i=0;i<c;i++)
       {
          a[i]=sc.nextInt()-1;
        }
      t[0].Compare(t,a,c);
       
    }
 }
