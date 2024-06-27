/*3. Implement the following
a. Create a package named shapes.
b. Create classes in the package representing common geometric shapes such as
Square, Triangle, and Circle. The classes should contain the area and
perimeter methods in them.
c. Compile the package.
d. Use this package (import the package) to find area and perimeter of different
shapes as chosen by the user.
*/
package shapes;
import java.util.*;
public class Square 
{
   public double getArea(int length)
    {
       return length*length;
    }
    public double getPerimeter(int s)
     {
         float p=4*s;
         return p;
     }
 
}
