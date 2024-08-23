import java.util.*;
class Decimal 
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);
System.out.print("Enter a decimal number: ");
int decimal = input.nextInt();
String binary = Integer.toBinaryString(decimal);
System.out.println("Binary representation: " + binary);
String reversedBinary = new StringBuilder(binary).reverse().toString();
System.out.println("Reversed binary representation: " + reversedBinary);
}
}