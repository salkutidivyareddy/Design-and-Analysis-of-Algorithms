/*2. Case study : Bank management system
Define a package bank.
Include following functionalities as abstract methods in an interface
abstract XXX credentialsCheck(String Username, String password);
abstract XXX credit( XXX);
abstract XXX debit( XXX);
abstract XXX displayBalance(XXX);
abstract XXX exit();

o.credentialsCheck("Chandana","abc");
        o.credit(20000);
Until user selects exit he can perform any of the above operations.
Handle the following exceptions during the transaction
1. Username and password mismatch. // display error message and continue;
2. If debit amount exceeds available balance. // display error message and
continue;
*/
import java.util.*;
import Bank.Operations;
class M72 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Operations o=new Operations();
        int x;
        System.out.println("1.Check Credintials\n2.credit\n3.Debit\n4.Balance Display\n5.exit");
        do{
          System.out.println("Enter");
           x=sc.nextInt();
          switch(x)
          {
            case 1:
             System.out.println("Enter name");
             String n=sc.next();
             System.out.println("Enter Passward");
            String p=sc.next(); 
            o.credentialsCheck(n,p);
            break;
            case 2:
            System.out.println("Enter Amount");
            int a=sc.nextInt();
            o.credit(a);
            break;
            case 3:
            System.out.println("Enter Amount");
            int b=sc.nextInt();
             o.debit(b);
             break;
             case 4:
               o.displayBalance();
               break;
            case 5:
              o.exit();
              break;
          }
       }
       while(true);
 }
}
       
    
