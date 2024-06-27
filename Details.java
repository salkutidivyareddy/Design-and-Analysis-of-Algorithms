/*2.Suppose that we are required to model students and teachers in our application. We can define
a superclass called Person to store common properties such as name and address, and subclasses
Student and Teacher for their specific properties. For students, we need to maintain the courses
taken and their respective grades; add a course with grade, print all courses taken and the
average grade. Assume that a student takes no more than 30 courses for the entire program. For
teachers, we need to maintain the courses taught currently, and able to add or remove a course
taught. Assume that a teacher teaches not more than 5 courses concurrently.*/
import java.util.*;
import java.util.HashMap;
class Person
{
    String name;
    String Address;
    Person(String s,String A)
    {
       this.name=s;
       this.Address=A;
    }
 }
 class Student extends Person
 {
     Student(String name,String a)
     {
        super(name,a);
      }
     HashMap<String,Integer> CG = new HashMap<String,Integer>();
     void addCourseGrade(String Course,int Grade)
     {
       CG.put(Course,Grade);
     }
     void printGrades()
     {
        System.out.println(CG.values());
     }
    
        
  }
  class Teacher extends Person
  {
  
   Teacher(String name,String a)
     {
        super(name,a);
      }
    ArrayList<String> al =new ArrayList<String>();
    
    boolean addCourse(String course)
    {
       if(al.contains(course)==true)
         return false;
       else
         {
           al.add(course);
           System.out.println(al);
           return true;
          }
     }
     boolean removeCourse(String Course)
     {
        if(al.contains(Course))
        {
        al.remove(Course);
           return true;
          }
         else
           {
             
             return false;
           }
     }
  }
  class Details
  {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
        Student s=new Student("Chandana","Vikarabad");
        int x;
        Teacher t=new Teacher("Sujatha","Hyderabad");
      
        System.out.println("Enter\n1.To add the Course and Grade of a Student\n2.Print Grades\n3.addCourse for teacher\n4.remove Course for teacher\n5.Average of Grades\n6.exit");
        do{
             String c;
             x=sc.nextInt();
             switch(x){
            case 1:
              System.out.println("Enter Course and Grade");
              c=sc.next();
              int g=sc.nextInt();
              s.addCourseGrade(c,g);
              break;
            case 2:
              s.printGrades();
              break;
            case 3:
               System.out.println("Enter Course");
               c=sc.next();
               System.out.println(t.addCourse(c));
               break;
             case 4:
             System.out.println("Enter Course");
                c=sc.next();
              System.out.println(t.removeCourse(c));
             // case 5:
             //   System.out.println("Average Grade:"+s.GradeAverage());
               // break;
           }
           }
             while(x!=6);
          }
   }   
               
            
          
       
       
