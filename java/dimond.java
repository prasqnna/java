import java.util.*;
class d
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in); 
System.out.print("Enter the number to be printed: "); 
int x=sc.nextInt(); 
System.out.print("Max Number of time printed: "); 
int n=sc.nextInt(); 
for(int i=1;i<=n;i++) 
{ 
for(int j=1;j<=i;j++) 
{ 
System.out.print(x); 
} 
System.out.println(); 
} 
for(int i=n-1;i>=1;i--) 
{     
for(int j=1;j<=i;j++) 
{ 
System.out.print(x); 
} 
System.out.println(); 
}
}
}
