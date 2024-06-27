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
import cost.M681;
import java.util.*;
class M68
{
    public static void main(String args[])
    {
        System.out.println("Welcome Book Your Tickets");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Passengers");
        int n=sc.nextInt();
        M681 p[]=new M681[n];
        for(int i=0;i<n;i++)
        {
           System.out.println("1.Children\n2.Student\n3.SeniorCitizen");
           int x=sc.nextInt();
           if(x==1)
            p[i]=new M681("Children");
           if(x==2)
            p[i]=new M681("Student");
           if(x==3)
            p[i]=new M681("Senior_Citizens");
        }
       System.out.println(p[0].total_fare(p,n));
    }    
        
   }     

