import java.util.*;
import Maths.*;
class Reverse_sum_demo
{
public static void main(String args[])
{
Reverse r=new Reverse();
Sum nr=new Sum();
int a, num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
num=sc.nextInt();
System.out.println("Enter your choice: ");
System.out.println("1. Reverse of the number");
System.out.println("2. Sum of the digits");
a=sc.nextInt();
if(a==1)
{
r.cal(num);
}
else if(a==2)
{
nr.calculate(num);
}
else
{
System.out.println("Invalid Input!!");
}
}
}