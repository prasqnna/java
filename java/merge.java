import java.util.*;
class MergeArrays 
{
public static void main(String[] args) 
{
int[] arr1 = {1, 3, 4, 5};
int[] arr2 = {2, 4, 6, 8};
ArrayList<Integer> mergedList = new ArrayList<>();
for (int num : arr1) mergedList.add(num);
for (int num : arr2) mergedList.add(num);
Collections.sort(mergedList);
System.out.println("Merged array: " + mergedList);
}
}
