Write a Java program to remove duplicate elements from an array.

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 7, 7, 8};

        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    // Shift elements to the left
                    for (int k = j; k < length - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    length--;
                    j--;
                }
            }
        }

        int[] uniqueArray = Arrays.copyOf(array, length);

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}
