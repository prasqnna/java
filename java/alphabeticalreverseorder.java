import java.util.*;
class reverseorder
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the string:");
String input=sc.nextLine();
char[] charArray=input.toCharArray();
Arrays.sort(charArray);
System.out.print("reverse order: ");
for(int i=charArray.length-1;i>=0;i--)
{
System.out.print(charArray[i]+" ");
}
}
}