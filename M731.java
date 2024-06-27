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
package audit;
import java.util.*;
interface methods
{
  void taxChecker(int x);
 // void taxPaid();
  void homeExpenditure(int x);
  void healthExpenditure(int x);
  void vehicleExpenditure(int x);
  void personalFamilyExpenditure(int x);
  void miscellaneousExpenditure(int x);
 }
 class Fraud extends Exception
 {
     Fraud(String x)
     {
        super(x);
      }
 }
    
public class M731 implements methods
{
    int totalIncome;
    int homeEx,healthEx,vehicleEx,FamilyEx,mEx;
    public M731(int x)
    {
      this.totalIncome=x;
     }
   public void homeExpenditure(int x)
    {
      this.homeEx=x;
    }
    public void healthExpenditure(int x)
    {
      this.healthEx=x;
    }
   public void vehicleExpenditure(int x)
   {
     vehicleEx=x;
    }
   public void personalFamilyExpenditure(int x)
   {
      FamilyEx=x;
    }
  public void miscellaneousExpenditure(int x)
  {
    mEx=x;
   }
   public void taxChecker(int x)
   {
     double t=(totalIncome-(homeEx+healthEx+vehicleEx+FamilyEx+mEx))*0.1;
      try{
       
      if(x==t)
         {
           System.out.println("Done!");
          }
        else{
           Fraud f=new Fraud("Mismatch");
           throw f;
          }
       }
      catch(Fraud k)
      {
        System.out.println(k.getMessage());
        System.out.println(t);
       }
    }
   
}
   
    
    
    
       
    
