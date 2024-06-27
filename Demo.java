//. Find the Area and perimeter of the circle
//. Find the Area and perimeter of the circle
import java.util.*;
class Circle {
 int radius;
  void  setCircle(int r)
   {
     radius=r;
     //System.out.println(radius);
    }
    void getArea()
    {
       
       System.out.println(3.14*radius*radius);
     }
    void getPerimeter()
    {
       
       System.out.println(2*3.14*radius);
     }
  }
 class Demo{
 
  public static void main(String args[]){
   Circle obj1= new Circle();
   Circle obj2=new Circle();
   Circle obj3=new Circle();
   obj1.setCircle(5);
   obj2.setCircle(10);
   obj3.setCircle(15);
   System.out.println("Area and Perimeter of Object1:");
   obj1.getArea();
   obj1.getPerimeter();
   System.out.println("Area and Perimeter of Object2:");
   obj2.getArea();
   obj2.getPerimeter();
   System.out.println("Area and Perimeter of Object3:");
   obj3.getArea();
   obj3.getPerimeter();
  }
  }
  /*
  Area and Perimeter of Object1:
78.5
31.400000000000002
Area and Perimeter of Object2:
314.0
62.800000000000004
Area and Perimeter of Object3:
706.5
94.2
*/
