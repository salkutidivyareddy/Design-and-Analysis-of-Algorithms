/*
2. Create an abstract class Employee with abstract method getAmount() which
displays the amount paid to employee.
Reuse this class to calculate the amount to be paid to WeeklyEmployees and
HourlyEmployees according to no. of hours and total hours for HourlyEmployee
and no. of weeks and total weeks for WeeklyEmployee.
*/
import java.lang.*;
import java.util.*;
abstract class Employee
{
  abstract int getAmount(int x);
}
class HourlyEmployee extends Employee
{
    int getAmount(int x)
    {
       return 100*x;
     }
  }
  class WeeklyEmployee extends Employee
  {
     int getAmount(int x)
     {
         return 1000*x;
      }
  }
 class WorkHours
 {
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        HourlyEmployee h=new HourlyEmployee();
         WeeklyEmployee w=new  WeeklyEmployee();
        System.out.println("Enter 1.Hourly Employee\n2.Weekly Employee");
        int x,l;
        x=sc.nextInt();
        if(x==1)
        {
         System.out.println("Enter number of Hours  Worked by an Employee");
         l=sc.nextInt();
         System.out.println("Amount = "+h.getAmount(l));
         }
        else
        {
         System.out.println("Enter number of Weeks  Worked by an employee");
         l=sc.nextInt();
         System.out.println("Amount = "+w.getAmount(l));
         }
  }
}

/*
Enter 1.Hourly Employee
2.Weekly Employee
2
Enter number of Weeks  Worked by an employee
5
Amount = 5000
*/
         
