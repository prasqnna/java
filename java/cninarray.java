class CompositeNumber 
{
public static void main(String[] args) 
{
int[] arr = {16, 18, 27, 16, 23, 21, 19};
int count = 0;
for (int num : arr) 
{
if (num > 1) 
{                 
boolean isComposite = false;
for (int i = 2; i <= Math.sqrt(num); i++) 
{
if (num % i == 0) 
{
isComposite = true;
break;
}
}
if (isComposite) 
{
count++;
}
}
}
System.out.println("Number of Composite Numbers = " + count);
}
}
