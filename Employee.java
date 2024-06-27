/*10. Write a program to display details of the required employee based on his Id.
The details of employee includes, Emp_name, Emp_age, Emp_gender,
Emp_designation, Emp_salary, Emp_Address etc.,*/
import java.lang.*;
import java.util.*;
class Create
{
  String Eid,Ename,Emp_gender;
  int age;
  Create(String id,String name,int age,String gender)
  {
    this.Eid=id;
    this.Ename=name;
    this.Emp_gender=gender;
    this.age=age;
  }
  void Details(Create arr[],String id,int n)
  {
    
   // System.out.println("Employee Name "+obj.Ename+"\n"+"Employee Age "+ age +"\n" +" Gender" +Emp_gender);
   for(int i=0;i<n;i++)
   {
      if(id.equals(arr[i].Eid))
      {
        System.out.println("Employee Details");
        System.out.println(arr[i].Eid +"\n"+arr[i].Ename+"\n"+arr[i].Emp_gender+"\n"+arr[i].age);
       break;
      }
      }
   }
}
class Employee
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Number of Employee");
     int n=sc.nextInt();
     Create[] arr;
     arr=new Create[n];
     
     for(int i=0;i<n;i++)
     {
        String id,name,gender;
        int age;
        System.out.println("Enter  Employee_id,name,gender,age");
        id=sc.next();
        name=sc.next();
        gender=sc.next();
        age=sc.nextInt();
        arr[i]=new Create(id,name,age,gender);
      }
      System.out.println("Enter Employee Id");
      String id=sc.next();
      arr[0].Details(arr,id,n);
   }
  }
 /*
 Enter Number of Employee
3
Enter  Employee_id,name,gender,age
1234
Chandana
female
20
Enter  Employee_id,name,gender,age
B192052
Prasanna
female
20
Enter  Employee_id,name,gender,age
B192247
Asma
female
20
Enter Employee Id
B192247
Employee Details
B192247
Asma
female
20
*/
  
  
