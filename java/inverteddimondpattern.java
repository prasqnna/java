import java.util.*;
class InvertedPyramid 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of rows: ");
int n = sc.nextInt();
for (int i = n; i >= 1; i--) 
{
for (int j = 0; j < n - i; j++) 
{
System.out.print(" ");
}
for (int k = 1; k <= (2 * i - 1); k++) 
{
System.out.print("*");
}
System.out.println();
}
}
}
