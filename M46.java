/*6. New year welcomes with a Grand sale from topmost E-commerce sites Amazon and Flipkart.
Design an application that prompts user to enter product name, company it belongs to and the
quantity(Note : you can input more if your application requires) and suggest him/her(cost
effective) where to buy the product either from Amazon or E-commerce.
Amazon offers 10% Discount for HDFC credit card holders and 15% discount on purchase
above 50,000.
Flipkart offers 30% Discount if he/she is a RGUKT student and 5% discount on purchase above
30,000.*/
import java.util.*;
class Amazon
{
   Boolean HDFC;
   double price=500;
   Scanner sc=new Scanner(System.in);
   Amazon(){
   System.out.println("R u An HDFC credit Card Holder");
   String t=sc.next();
    if(t.equalsIgnoreCase("yes"))
       HDFC=true;
    else
      HDFC=false;
      }
    
    double Calculate(int q)
    {
      if(Boolean.compare(HDFC,true)==0)
        {
          if(price*q>50000)
             price=price-price*0.25;
          else
          price=price-price*0.1;
         }
        
       return price;
     }
 }
 class Flipkart
 {
   Boolean RGUKT;
   double price=500;
   Scanner sc=new Scanner(System.in);
    //Boolean HDFC;
    Flipkart(){
   System.out.println("R u Student of RGUKT");
   String t=sc.next();
    if(t.equalsIgnoreCase("yes"))
       RGUKT=true;
    else
      RGUKT=false;
      }
    
    double Calculate(int q)
    {
      if(Boolean.compare(RGUKT,true)==0)
        {
          if(price*q>30000)
             price=price-price*0.35;
          else
          price=price-price*0.3;
         }
        
       return price;
     }
   
}  
   
class M46
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Product name and Comapany and Quantity");
     String p=sc.next();
     String c=sc.next();
     int q=sc.nextInt();
     Amazon a=new Amazon();
     Flipkart f=new Flipkart();
     double ap=a.Calculate(q);
     double fp=f.Calculate(q);
     if(ap<fp)
      System.out.println("Buy in Amazon With Prize ="+ap);
     else
      System.out.println("Buy in Flipkart With Prize ="+fp) ;
    }
  }
     
     
           
