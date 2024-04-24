 //Write a Java program to insert an element (specific position) into an array.

import java.util.Scanner;

public class InsertElementIntoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();
        System.out.print("Enter the position to insert: ");
        int position = scanner.nextInt();
        if (position < 0 || position > size) {
            System.out.println("Invalid position. Element cannot be inserted.");
        } else {
            for (int i = size - 1; i > position; i--) {
                arr[i] = arr[i - 1];
            }
            arr[position] = element;
            size++; 
            System.out.print("Array after inserting element: ");
            for (int i = 0; i <= size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
