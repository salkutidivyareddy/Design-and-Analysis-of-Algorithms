/*
5.
a. Include the package complex
b. Create a class Arith and declare rp, ip as integer.
c. Define the function Arith(),set rp and ip to 0
d. Another function Arith(int rp,in tip) set this.rp=rp and this.ip=ip
e. create a method add() pass arguments with arith a1 and arith a2
f. add a1.rp and a2.rp store in rp.g. Similarly add a1.ip and a2.ip and store in ip.
h. Create a function sub(arith a1,arith a2)
i. Subtract a1.rp and a2.rp store it in rp.
j. Subtract a1.ip and a2.ip store it in ip.
k. Import the package and calculate the addition and subtraction of two complex numbers */
package complex;
import java.util.*;
public class Arith
{
   int rp,ip;
   public Arith()
   {
      rp=0;
      ip=0;
   }
   public Arith(int rp,int ip)
   {
      this.rp=rp;
      this.ip=ip;
    }
   public void add(Arith a1,Arith a2)
   {
    int rp=a1.rp+a2.rp;
    int ip=a1.ip+a2.ip;
    System.out.println("Addition of Two Complex Numbers"+" "+rp +"+j" +ip);
   }
     public void sub(Arith a1,Arith a2)
   {
    int rp=a1.rp-a2.rp;
    int ip=a1.ip-a2.ip;
    System.out.println("Subtraction of Two Complex Numbers"+" "+rp+"+j" +ip);
   }
}
    
    
