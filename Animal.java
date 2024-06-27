/*5. Suggest the Dog to the buyer in a Kennel.
Get input from the user and suggest the Dog. Inputs may include : breed, type, height etc.,,
output is dogs name.*/
import java.lang.*;
import java.util.*;
class Dog
{
  String breed,name,Color,Type;
  double height;
  Dog(String breed,String name,String Color,String Type,double height)
  {
  this.breed=breed;
  this.name=name;
  this.Color=Color;
  this.Type=Type;
  this.height=height;
 }
 void getDetail()
 {
   //System.out.println("Dog Type ,Breed ,Color ,Height");
   System.out.println(name + "  is available with that features");
 }
 }
 class Animal
 {
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     Dog d1=new Dog("pomerian","snoopy","White","guard",1);
     Dog d2=new Dog("lab","Rocky","Brown","Sniffer",3);
     Dog d3=new Dog("g.sheperd","snowy","black","shepard",4);
     System.out.println("Enter the Dog Type,Breed,Color,Height that you are willing to Buy");
     String type=sc.next();
     String breed=sc.next();
     String Color=sc.next();
     double height=sc.nextInt();
     if(type.equals(d1.Type))
       d1.getDetail();
     if(type.equals(d2.Type));
       d2.getDetail();
    }
  }
