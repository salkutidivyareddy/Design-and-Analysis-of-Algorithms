/*
3.Case study : Tax fraud detection
Define package audit.
Include following functionalities as abstract methods in an interface.
abstract XXX taxChecker (XXX);
abstract XXX taxPaid(XXX);
abstract XXX homeExpenditure(XXX);
abstract XXX healthExpenditure(XXX);
abstract XXX vehicleExpenditure(XXX);
abstract XXX personalFamilyExpenditure(XXX);
abstract XXX miscellaneousExpenditure(XXX);
Inputs : all the above expenditures, TotalIncome and Taxpaid
He/She has to pay 10% of ( TotalIncome- (all other expenditures)) on mismatch
throw an exception as fraud and display message, how much he/she has to pay
*/
import java.util.*;
import audit.M731;
class M73
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int x,y,v,p,me,i;
     System.out.println("enter Income");
     i=sc.nextInt();
     M731 m=new M731(i);
     System.out.println("Enter Home,Health,vehicle,personalFamily,miscellaneousExpenditures");
     x=sc.nextInt();
     y=sc.nextInt();
     v=sc.nextInt();
     p=sc.nextInt();
     me=sc.nextInt();
     m.homeExpenditure(x);
     m.healthExpenditure(y);
     m.vehicleExpenditure(v);
     m.personalFamilyExpenditure(p);
     m.miscellaneousExpenditure(me);
     System.out.println("enter Tax");
     int tax=sc.nextInt();
     m.taxChecker(tax);
   }
}
     




