/*2. Write a Java program to create package called dept. include a interface with methods display_subjects() and create four classes as CSE, ECE, ME and CE that implements the interface to display their respective dept‟s subjects lists. Import the package to display the subjects list dept wise.*/
package dept;
interface Subjects
{
   void display_subjects();

 }
 public class  CSE implements Subjects
 {
    //String Subjects[]={"DBMS" ,"DSA"};
    public void display_subjects()
    {
       System.out.println("DBMS\nDSA");
    }
 }
  
