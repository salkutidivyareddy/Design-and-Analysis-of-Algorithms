/*3. Implement the following
a. Create a package named shapes.
b. Create classes in the package representing common geometric shapes such as
Square, Triangle, and Circle. The classes should contain the area and
perimeter methods in them.
c. Compile the package.
d. Use this package (import the package) to find area and perimeter of different
shapes as chosen by the user.
*/
import java.util.*;
import shapes.Square;
import shapes.Circle;
import shapes.Triangle;
 class M63
 {
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      Square s=new Square();
      System.out.println("Area of Square ="+s.getArea(4));
      System.out.println("Perimeter of Sqaure ="+s.getPerimeter(4));
      Triangle t=new Triangle();
       System.out.println("Area of triangle ="+t.getArea(2,4));
      System.out.println("Perimeter of Triangle  ="+t.getPerimeter(2,4,2));
      Circle r=new Circle();
       System.out.println("Area of Circle ="+r.getArea(4));
       System.out.println("Perimeter of Sqaure ="+r.getPerimeter(4));
     
    }
 }
