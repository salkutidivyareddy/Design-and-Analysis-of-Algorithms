/*5. Implement the following case study.
RBI governs and formulates rules and regulations for SBI, HDFC and DCB
Banks.
Rules framed by RBI:
i. All banks should facilitate credit(), debit(), displayBalance(),
PersonalLoanEligibility(), homeLoanEligibility(), vehicleLoanEligibilty() to
customers.

ii. credit(),debit() and displayBalance() are common for all Banks where as rest of
functionalities changes with respect to Banks.
iii. Make necessary assumptions on Loan eligibilities like Loan eligibility changes
as per his/her annual income, type of job(gvt/private), it depends on his property
and medical fitness etc.,
*/
import java.lang.*;
import java.util.*;

abstract class RBI
{
  int balance;
  abstract void PersonalLoanEligibility(); 
  abstract void homeLoanEligibility();
  abstract void vehicleLoanEligibilty();
  void credit(int x)
  {
    
    balance=balance+x;
   
    System.out.println("After Crediting Available Balance = " +balance);
   }
  void debit(int x)
  {
    balance=balance-x;
    System.out.println(x + "Amount Debited From Your Account");
  }
   int displayBalance()
   {
      return balance;
    }
}
class SBI extends RBI
{
   Scanner sc = new Scanner(System.in);
   SBI(int b)
   {
      balance=b;
    }
  
   void PersonalLoanEligibility()
   {
   System.out.println("Enter Annual income :");
   int x=sc.nextInt();
   System.out.println("Enter Type of job Government or private");
   String t=sc.next();
   System.out.println("Enter Gender M/F");
   String ty=sc.next();
   if(x>100000)
   {
     if(ty.equals("M")) 
   {
    if(t.equals("Government"))
      System.out.println("Eligible");
    }
   }
   else
     System.out.println("Not Eligible");
  }
   void homeLoanEligibility()
   {
   System.out.println("Enter Annual income :");
   int x=sc.nextInt();
   System.out.println("Enter Type of job Government or private");
   String t=sc.next();
   System.out.println("Enter Gender M/F");
   String ty=sc.next();
   if(x>100000 && ty.equals("M") && t.equals("Governemnt"))
      System.out.println("Eligible");
   else
     System.out.println("Not Eligible");
  }
   void vehicleLoanEligibilty()
   {
      System.out.println("Enter Annual income :");
   int x=sc.nextInt();
   System.out.println("Enter Type of job Government or private");
   String t=sc.next();
   System.out.println("Enter Gender M/F");
   String ty=sc.next();
   if(x>100000 && ty.equals("M") && t.equals("Governemnt"))
      System.out.println("Eligible");
   else
     System.out.println("Not Eligible");
   }
 }
 
 class HDFC extends RBI
{
   Scanner sc = new Scanner(System.in);
    HDFC(int b)
    {
      balance=b;
     }
   void PersonalLoanEligibility()
   {
   System.out.println("Enter Annual income :");
   int x=sc.nextInt();
   System.out.println("Enter Type of job Government or private");
   String t=sc.next();
   System.out.println("Enter Gender M/F");
   String ty=sc.next();
   if(x>100000 && ty.equals("M") && t.equals("Governemnt"))
      System.out.println("Eligible");
   else
     System.out.println("Not Eligible");
  }
   void homeLoanEligibility()
   {
   System.out.println("Enter Annual income :");
   int x=sc.nextInt();
   System.out.println("Enter Type of job Government or private");
   String t=sc.next();
   System.out.println("Enter Gender M/F");
   String ty=sc.next();
   if(x>100000 && ty.equals("M") && t.equals("Governemnt"))
      System.out.println("Eligible");
   else
     System.out.println("Not Eligible");
  }
   void vehicleLoanEligibilty()
   {
      System.out.println("Enter Annual income :");
   int x=sc.nextInt();
   System.out.println("Enter Type of job Government or private");
   String t=sc.next();
   System.out.println("Enter Gender M/F");
   String ty=sc.next();
   if(x>100000 && ty.equals("M") && t.equals("Governemnt"))
      System.out.println("Eligible");
   else
     System.out.println("Not Eligible");
   }
 }
 
 class DCB extends RBI
{
   Scanner sc = new Scanner(System.in);
   DCB(int b)
   {
     balance=b;
   }
   void PersonalLoanEligibility()
   {
   System.out.println("Enter Annual income :");
   int x=sc.nextInt();
   System.out.println("Enter Type of job Government or private");
   String t=sc.next();
   System.out.println("Enter Gender M/F");
   String ty=sc.next();
   if(x>100000 && ty.equals("M") && t.equals("Governemnt"))
      System.out.println("Eligible");
   else
     System.out.println("Not Eligible");
  }
   void homeLoanEligibility()
   {
   System.out.println("Enter Annual income :");
   int x=sc.nextInt();
   System.out.println("Enter Type of job Government or private");
   String t=sc.next();
   System.out.println("Enter Gender M/F");
   String ty=sc.next();
   if(x>100000 && ty.equals("M") && t.equals("Governemnt"))
      System.out.println("Eligible");
   else
     System.out.println("Not Eligible");
  }
   void vehicleLoanEligibilty()
   {
      System.out.println("Enter Annual income :");
   int x=sc.nextInt();
   System.out.println("Enter Type of job Government or private");
   String t=sc.next();
   System.out.println("Enter Gender M/F");
   String ty=sc.next();
   if(x>100000 && ty.equals("M") && t.equals("Governemnt"))
      System.out.println("Eligible");
   else
     System.out.println("Not Eligible");
   }
 }


class Loan
{
  
   public static void main(String args[])
   {
      Scanner sc= new Scanner(System.in);
      SBI p1= new SBI(1000);
      p1.credit(100);
      HDFC p2=new HDFC(500);
      DCB p3=new DCB(8000);
      p1.homeLoanEligibility();
    }
}
      

 
  
    
     
  
    


