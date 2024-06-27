/*8. create a package with interface reservation_cost with abstract method total_fare(
Passenger[] passengers) where as Passenger : class, passengers : reference to array
of objects.
Create a class that implements the method of interface to find the total_fare of the
reservation.
Passengers can be children, students, citizens, seniorcitizens.
The fare for children zero, and for students 30% discount of the actual fare, for
senior citizens 50% discount of the actual fare and no discount for citizens.
Import the package to find the total fare of all passengers.
*/
package cost;
import java.util.*;
interface reservation_cost
{
  double total_fare(M681[] passengers,int n);
}
public class M681 implements reservation_cost
{
    String type;
    public M681(String t)
    {
      type=t;
    }
    public double total_fare(M681[] p,int n)
    {  double total=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Fare");
       double fare=sc.nextDouble();
       double sf=(fare-fare*0.3);
       double cf=(fare-fare*0.5);
        for(int i=0;i<n;i++){
      if((p[i].type).equalsIgnoreCase("children"))
        total=total+0;
       if((p[i].type).equalsIgnoreCase("Student"))
        total=total+sf;
       if((p[i].type).equalsIgnoreCase("senior_citizens"))
        total=total+cf;
        //System.out.println(p[i].type+total);
      }
   return total;
  }
}
       
  
