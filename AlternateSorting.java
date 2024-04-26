//Write a Java program to sort an array of positive integers from an array. In the sorted array the value of the first element should be maximum, the second value should be a minimum, third should be the second maximum, the fourth should be the second minimum and so on.

import java.util.Arrays;

public class AlternateSorting {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 9, 1, 6};
        sortAlternate(array);
        System.out.println("Sorted array with alternate max/min: " + Arrays.toString(array));
    }

    public static void sortAlternate(int[] array) {
        Arrays.sort(array);

        int[] result = new int[array.length];
        int left = 0, right = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                result[i] = array[right--];
            } else {
                result[i] = array[left++];
            }
        }

        System.arraycopy(result, 0, array, 0, array.length);
    }
}
