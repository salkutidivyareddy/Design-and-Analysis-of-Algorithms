/*11. A mail-order house sells five products whose retail prices are as follows :
Product1 : Rs. 99.90 , Product 2 : Rs. 20.20 , Product 3 : Rs. 6.87 , Product 4 : Rs. 45.50
and Product 5 : Rs. 40.49 .
Each product has Prdouct_Id, Product_Name, Product_Quantity, Product_Price.
Write an application that reads a series of pairs of numbers as follows :
a) product Id
b) quantity sold
your program use a switch statement to determine the retail price for each product and
it should calculate and display the total retail value of all products sold */
import java.lang.*;
import java.util.*;
class Create
{
  String Pid,Pname;
  float P_price;
  Create(String id,String name,float price )
  {
    this.Pid=id;
    this.Pname=name;
    this.P_price=price;
  }
  float Details(Create arr[],String id,int n)
  {
    float p=0;
   // System.out.println("Employee Name "+obj.Ename+"\n"+"Employee Age "+ age +"\n" +" Gender" +Emp_gender);
   for(int i=0;i<n;i++)
   {
      if(id.equals(arr[i].Pid))
      {
       p=arr[i].P_price;
       break;
      }
      }
      return p;
   }
}
class Product
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Number of Products");
     int n=sc.nextInt();
     Create[] arr;
     arr=new Create[n];
     
     for(int i=0;i<n;i++)
     {
        String id,name;
        float price;
        System.out.println("Enter  Product_id,name,name,price");
        id=sc.next();
        name=sc.next();
        price=sc.nextFloat();
        arr[i]=new Create(id,name,price);
      }
      System.out.println("Enter Product_id Along with Quantity Sold \n 0 if completed");
      int t=1;
      float total=0;
      while(t!=0){
      String id=sc.next();
      float qty=sc.nextFloat();
      if(qty==0)
        break;
      float pp=qty*arr[0].Details(arr,id,n);
      System.out.println(id+"--"+pp);
      total=total+pp;
      
      
      }
      System.out.println("Total Price --" + total);
   }
  }
  
  /*
  Enter Number of Products
3
Enter  Product_id,name,name,price
543
chocolates
20
Enter  Product_id,name,name,price
876
Biscuits
10
Enter  Product_id,name,name,price
091
apple
30
Enter Product_id Along with Quantity Sold 
 0 if completed
091
2
091--60.0
876
1
876--10.0
0
0
Total Price --70.0
*/
