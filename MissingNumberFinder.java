//Write a Java program to find a missing number in an array

public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 9, 10}; // Sample array with a missing number (5)

        int n = numbers.length + 1; // Length of array + 1 (since one number is missing)
        int sum = 0;

        // Calculate the sum of numbers in the array
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate the sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Find the missing number
        int missingNumber = expectedSum - sum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
