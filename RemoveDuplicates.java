 //Write a Java program to remove duplicate elements from a given array and return the updated array length.
//Sample array: [20, 20, 30, 40, 50, 50, 50]
//After removing the duplicate elements the program should return 4 as the new length of the array. 

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {20, 20, 30, 40, 50, 50, 50};
        int newLength = removeDuplicates(array);
        System.out.println("New length of the array after removing duplicates: " + newLength);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(array, newLength)));
    }

    public static int removeDuplicates(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int j = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[j]) {
                j++;
                array[j] = array[i];
            }
        }

        return j + 1;
    }
}
