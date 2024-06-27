package shapes;
import shapes.Square;
import java.util.*;
public class Triangle
{
 public double getArea(int b,int h)
     {
          double a=0.5*b*h;
          return a;
         //System.out.println("Area of Circle "+a);
      }
   public double getPerimeter(int a,int b,int c)
     {
         double p=a+b+c;
         //System.out.println("Perimeter of Circle= "+p);
         return p;
     }
 }
