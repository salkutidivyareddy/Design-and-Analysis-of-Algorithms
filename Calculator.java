/*
1. Implement a Calculator application : Include all calculator operations as
abstract methods in a interface and include it in a Package “calculator” and
implement all operations in a class and import the package to design calculator.*/
package Calci;
import java.lang.*;
interface Operations
{
   double add(double a,double b);
   double subtract(double a,double b);
   double mul(double a,double b);
   double div(double a,double b);
   double modulo(int a,int b);
 }
 public  class Calculator implements Operations
 {
    public double add(double a,double b)
    {
       return a+b;
    }
  public double subtract(double a,double b)
  {
     return a-b;
   }
  public double mul(double a,double b)
  {
     return a*b;
   }
  public double div(double a,double b)
  {
      return a/b;
   }
   public double modulo(int a,int b)
   {
     return a%b;
   }
 }
 

