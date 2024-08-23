import java.util.*;
class fib
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the value of n:");
int n=sc.nextInt();
System.out.print("enter the value of a:");
int a=sc.nextInt();
System.out.print("enter the value of b:");
int b=sc.nextInt();
for(int i=0;i<=n;i++)
{
int c=a+b;
a=b;
b=c;
System.out.print(" "+c);
}
}
}