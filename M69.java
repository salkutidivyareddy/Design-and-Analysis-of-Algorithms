/*9. create a package admission and include interfaces and classes and import them
to design a system for engineering admissions.
Admission to an Engineering college is given if the following conditions are
Satisfied
(i) Maths marks >= 90
(ii) Physics marks >= 95
(iii) Chemistry marks >= 70
(iv) English marks >= 80
(v) Total percentage in all Four subjects >= 80
given the marks in Four subjects, implement a program to process the applications
to list the eligible students.
*/
import admission.M691;
import java.util.*;
class M69
{
   public static void main(String args[])
   {
     System.out.println("Enter number of Students");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     M691 s[]=new M691[n];
     for(int i=0;i<n;i++)
     {
       System.out.println("Enter Name,Maths marks,Physics Marks,Chemistry Marks and English Marks");
       String na=sc.next();
       double m=sc.nextDouble();
       double p=sc.nextDouble();
       double c=sc.nextDouble();
       double e=sc.nextDouble();
       s[i]=new M691(na,m,p,c,e);
      }
      System.out.println("Eligible Students ");
     s[0].Eligible_students(s,n);
    }
 }
       
     
