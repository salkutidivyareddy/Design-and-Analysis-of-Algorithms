/*4. Mr.Bean claims himself as efficient software developer and claims that his
application can handle the following exceptions
ArithmeticException, NullPointerExceptions, ArrayIndexOutOfBoundsException,
IOException etc., . You being the Tester test the application to validate his claims.
Hint : Develop any application that handle’s all the exceptions stated above.
*/
import java.util.*;

class M74
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size of an Array");
    int n=sc.nextInt();
    int a[]=new int[n];
    try{
    a[n+1]=9;
    int b=9;
    int x=0;
    int t=b/x;
    // throw new NullPointerException();
    }
    catch(NullPointerException ae)
    {
       System.out.println(ae);
     }
    catch(ArithmeticException ae)
    {
      System.out.println(ae);
    }
    catch(ArrayIndexOutOfBoundsException ae)
    {
      System.out.println(ae.getMessage());
    }
    
}
}
    
    
    
