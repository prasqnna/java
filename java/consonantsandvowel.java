import java.util.*;
class consonantsandvowelcounter
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enther the statement:");
String input=sc.nextLine();
String vowels="";
String consonants="";
for(int i=0;i<input.length();i++)
{
char c=input.charAt(i);
if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' )
{
vowels+= c+"";
}else if (Character.isLetter(c))
{ 
consonants += c + " ";
}
}
System.out.println("vowels: "+vowels);
System.out.println("consonants:"+consonants);
}
}