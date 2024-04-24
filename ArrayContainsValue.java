//Write a Java program to test if an array contains a specific value.

import java.util.Scanner;
import java.util.Arrays;


public class ArrayContainsValue {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
		System.out.println("Array user given"+ Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
		

        System.out.print("Enter the value to check in the array: ");
        int valueToFind = scanner.nextInt();

        boolean containsValue = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToFind) {
                containsValue = true;
                break;
            }
        }

        if (containsValue) {
            System.out.println("Array contains the value " + valueToFind);
        } else {
            System.out.println("Array does not contain the value " + valueToFind);
        }

        scanner.close();
    }
}

