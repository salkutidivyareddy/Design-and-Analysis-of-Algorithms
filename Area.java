/*1. Write an application that prompts the user for required inputs to find the area and perimeter
of Circle, Square, Rectangle using methods getArea( ) and getPerimeter( ).*/
import java.util.*;
import java.lang.*;
class Calculate
{
   void  getArea(double r)
     {
          double a=3.14*r*r;
         System.out.println("Area of Circle "+a);
      }
    void getPerimeter(double r)
     {
         double p=2*Math.PI*r;
         System.out.println("Perimeter of Circle= "+p);
     }
      void getArea(int s)
     {
          float a=s*s;
         System.out.println("Area of Square "+a);
      }
     void getPerimeter(int s)
     {
         float p=4*s;
         System.out.println("Perimeter of Square= "+p);
     }
                 
     void getArea(int l,int b)
     {
          float a=l*b;
         System.out.println("Area of Rectangle= "+a);
      }
     void getPerimeter(int l,int b)
     {
         float p=2*(l+b);
         System.out.println("Perimeter of Rectangle= "+p);
     }

}
class Area
{
   public static void main(String args[])
   {
       Calculate c=new Calculate();
       c.getArea(2);
       c.getPerimeter(2);
        c.getArea(1.0);
       c.getPerimeter(1.0);
        c.getArea(2,4);
       c.getPerimeter(2,4);
    }
}
