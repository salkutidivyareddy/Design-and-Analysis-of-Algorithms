/* 1. Create an abstract class Shape which calculate the area and volume of 2-d and
3-d shapes with abstract methods getArea() and getVolume().
Reuse this class to calculate the area and volume of square, circle, cube and sphere. */
import java.lang.*;
import java.util.*;

/*
A = 4 π r2
Volume of a Sphere	V = (4 ⁄ 3) π r3
*/
abstract class shape3d
{
   abstract double getArea();
   abstract double getVolume();
 }
 abstract class shape2d
 {
    abstract double getArea();
  }
class Square extends shape2d
{
    int length;
    Square(int l)
    {
      length=l;
     }
    double getArea()
    {
       return length*length;
    }
 
 }
class Cube extends shape3d
{
    int length;
    Cube(int l)
    {
      length=l;
     }
    double getArea()
    {
       return length*length;
    }
    double getVolume()
    {
       return length*length*length;
     }
  }
 class Sphere extends shape3d
{
    int radius;
    Sphere(int l)
    {
      radius=l;
     }
    double getArea()
    {
       return 4*3.14*radius*radius;
    }
    double getVolume()
    {
       return 1.33*3.14*radius*radius*radius;
     }
  }
  class Circle extends shape2d
  {
     int radius;
     Circle(int r)
     {
       radius=r;
     }
    double getArea()
    {   
       return 3.14*radius*radius;
    }
  }
 class Calculate
 {
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      Sphere s=new Sphere(4);
      System.out.println("Area of Sphere ="+s.getArea());
      System.out.println("Volume of Sphere ="+s.getVolume());
      Cube c=new Cube(4);
       System.out.println("Area of Cube ="+c.getArea());
      System.out.println("Volume of Cube ="+c.getVolume());
      Circle r=new Circle(4);
       System.out.println("Area of Circle ="+r.getArea());
      Square q=new Square(4);
       System.out.println("Area of Square ="+q.getArea());
     
    }
 }
 /*
 javac Calculate.java
student@CSE-LAB:~/Desktop/oopc2$ java Calculate
Area of Sphere =200.96
Volume of Sphere =267.27680000000004
Area of Cube =16.0
Volume of Cube =64.0
Area of Circle =50.24
Area of Square =16.0
*/
      
  
        
    
