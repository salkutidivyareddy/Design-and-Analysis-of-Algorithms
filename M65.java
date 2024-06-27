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
import complex.Arith;
import java.util.*;
class M65
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Eneter complex Number1 real and Imaginary Parts");
    int rp=sc.nextInt();
    int ip=sc.nextInt();
    Arith a1=new Arith(rp,ip);
    System.out.println("Eneter complex Number2 real and Imaginary Parts");
    rp=sc.nextInt();
    ip=sc.nextInt();
    Arith a2=new Arith(rp,ip);
    a1.add(a1,a2);
    a1.sub(a1,a2);
 }
}
/*
Eneter complex Number1 real and Imaginary Parts
10
5
Eneter complex Number2 real and Imaginary Parts
5
2
Addition of Two Complex Numbers 15+j7
Subtraction of Two Complex Numbers 5+j3
*/
