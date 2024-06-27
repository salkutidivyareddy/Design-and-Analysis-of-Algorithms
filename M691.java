/*
9. create a package admission and include interfaces and classes and import them
to design a system for engineering admissions.
Admission to an Engineering college is given if the following conditions are
Satisfied
(i) Maths marks >= 90
(ii) Physics marks >= 95
(iii) Chemistry marks >= 70
(iv) English marks >= 80
(v) Total percentage in all Four subjects >= 80
given the marks in Four subjects, implement a program to process the applications
to list the eligible students.*/
package admission;
import java.util.*;
interface Eligible
{
  void Eligible_students(M691 s[],int n);
 }
public class M691 implements Eligible
 {
   double Maths_Marks;
   String name;
   double Physics_Marks;
   double Chemistry_Marks;
   double English_Marks;
   public M691(String n,double m,double p,double c,double e)
   {
          name=n;
          Maths_Marks=m;
          Physics_Marks=p;
          Chemistry_Marks=c;
          English_Marks=e;
     }
    public void Eligible_students(M691 s[],int n)
    {  //System.out.println("3");
       for(int i=0;i<s.length;i++)
       {
           if(s[i].Physics_Marks>=95 && s[i].Maths_Marks>=90 && s[i].Chemistry_Marks>=70 && s[i].English_Marks>=80)
            System.out.println(s[i].name);
       }
   }
 }
 
