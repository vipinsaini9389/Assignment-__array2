//Write a Java program to check if an array of integers contains two specified elements 65 and 77.
import java.util.Scanner;

public class ArrayCheck {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 65, 30, 40, 77};
        int[] arr2 = {10, 20, 30, 40, 50};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first element to check: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second element to check: ");
        int num2 = scanner.nextInt();

        System.out.println("Array 1: " + checkArray(arr1, num1, num2));
        System.out.println("Array 2: " + checkArray(arr2, num1, num2));
    }

    public static boolean checkArray(int[] arr, int num1, int num2) {
        boolean found1 = false;
        boolean found2 = false;

        for (int num : arr) {
            if (num == num1) {
                found1 = true;
            } else if (num == num2) {
                found2 = true;
            }
            if (found1 && found2) {
                return true;
            }
        }

        return false;
    }
}

