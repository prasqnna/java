import java.util.Arrays;
import java.util.Scanner;

class NameSorter 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the names separated by spaces:");
String input = scanner.nextLine();
String[] names = input.split(" ");
System.out.print("Order (A/D): ");
String order = scanner.nextLine().toUpperCase();
Arrays.sort(names);
if (order.equals("D")) 
{
for (int i = 0; i < names.length / 2; i++) 
{
String temp = names[i];
names[i] = names[names.length - 1 - i];
names[names.length - 1 - i] = temp;
}
}
System.out.println("Sorted names:");
for (String name : names) 
{
System.out.println(name);
}
scanner.close();
}
}