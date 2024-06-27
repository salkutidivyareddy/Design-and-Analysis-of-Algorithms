package shapes;
import shapes.Square;
import java.util.*;
public class Circle
{
  public double getArea(double r)
     {
          double a=3.14*r*r;
          return a;
         //System.out.println("Area of Circle "+a);
      }
    public double getPerimeter(double r)
     {
         double p=2*Math.PI*r;
         //System.out.println("Perimeter of Circle= "+p);
         return p;
     }
 }
