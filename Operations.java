package Bank;
import java.util.*;

/*2. Case study : Bank management system
Define a package bank.
Include following functionalities as abstract methods in an interface
abstract XXX credentialsCheck(String Username, String password);
abstract XXX credit( XXX);
abstract XXX debit( XXX);
abstract XXX displayBalance(XXX);
abstract XXX exit();

Until user selects exit he can perform any of the above operations.
Handle the following exceptions during the transaction
1. Username and password mismatch. // display error message and continue;
2. If debit amount exceeds available balance. // display error message and
continue;*/
 interface Details 
{
     void credentialsCheck(String Username, String password);
     void credit(int amount);
     void debit( int amount);
     void displayBalance();
     void exit();
 }
 
class MyException extends Exception {
 MyException(String s)
 {
   super(s);
 }
 }
public class Operations implements Details
{
   //String Username,passward;
   //int Balance;
   //Operations(String n,String p,int x)
   //{
     String  Username="Chandana";
       String passward="abc";
       int Balance=10000;
    //}
      
   public void credentialsCheck(String name,String p)
   {
      try{
        if(name.equals(this.Username) && p.equals(this.passward))
           System.out.println("Perfect");
         else
         {
           MyException me=new MyException("Mismatch");
           throw me;
         }
         }
       catch(MyException me)
       {
         System.out.println(me);
         this.exit();
       }
    }
  public void debit(int amount){
  try{
   if(amount<Balance)
   {
     Balance=Balance-amount;
     System.out.println("Amount Debited ="+amount);
   }
   else{
     
           MyException me=new MyException("less Balance");
           throw me;
         }
      }
   catch(MyException me)
       {
         System.out.println(me);
       }
  }
     public void  credit( int amount){
        Balance=Balance+amount;
        }
    public void  displayBalance(){
        System.out.println(Balance);
       }
     public void exit(){
        System.exit(0);
       }  
  }

  
  
        
            
 
