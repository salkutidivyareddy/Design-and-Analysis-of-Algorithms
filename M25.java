/*Suggest the Dog to the buyer in a Kennel.
Get input from the user and suggest the Dog. Inputs may include : breed, type, height etc.,,
output is dogs name.*/
import java.util.*;
class Dog
{
    String Name;
    String Breed;
    String Color;
    double height;
    String type;
  Dog(String N,String b,String c,String t,double h)
  {
     Name=N;
     Breed=b;
     Color=c;
     height=h;
     type=t;
   }
  String getBreed()
   {
      return Breed;
   }
  String getName()
   {
      return Name;
   }
  String getColor()
   {
      return Color;
   }
  double getHeight()
   {
      return height;
   }
  String Suggest(Dog d[],int n,String b,String t,double h)
  {
     for(int i=0;i<n;i++)
     {
         System.out.println("Name"+d[i].Name+" "+"Breed"+d[i].Breed);
        // System.out.println("None");
      }
     String k="None";
     for(int i=0;i<n;i++)
     {
        if(b.equalsIgnoreCase(d[i].Breed) /*&& h==height)*/&& t.equalsIgnoreCase(d[i].type) && h==d[i].height)
           return d[i].Name;
       }
       return k;
  }
 }
 class M25
 {
    public static void main(String args[])
    {
        Dog d[]=new Dog[3];
         d[0]=new  Dog("snoopy","pomerian","white","gaurd",1.0);
          d[1]=new Dog("rocky","lab","Brown","Sniffer",3.0);
         d[2]= new Dog("snowy","sheperd","black","sheperd",4.0);
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Breed,type,Height");
      String b=sc.next();
      String t=sc.next();
      double h=sc.nextDouble();
     System.out.println(d[0].Suggest(d,3,b,t,h));
  }
 }
 
