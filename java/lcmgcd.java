import java.util.*;

class LCMGCD {

    // Method to calculate GCD of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Method to calculate LCM of two numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Method to find GCD of an array of numbers
    public static int findGCD(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]);
        }
        return result;
    }

    // Method to find LCM of an array of numbers
    public static int findLCM(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = lcm(result, numbers[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Correct instance usage

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();  // Corrected: input.nextInt()

        int[] numbers = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();  // Corrected: input.nextInt()
        }

        int gcd = findGCD(numbers);
        int lcm = findLCM(numbers);

        System.out.println("GCD of the given numbers: " + gcd);
        System.out.println("LCM of the given numbers: " + lcm);
    }
}
