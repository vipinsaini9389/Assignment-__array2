//48. Write a Java program to arrange the elements of an array of integers so that all negative integers appear before all positive integers.  
import java.util.Arrays;

public class ArrangeNegativePositive2 {
    public static void main(String[] args) {
        int[] array = {1, -3, -2, 4, 5, -7, -6, 8};
        System.out.println("Original array: " + Arrays.toString(array));

        arrangeNegativePositive(array);

        System.out.println("Arranged array: " + Arrays.toString(array));
    }

    public static void arrangeNegativePositive(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (array[left] < 0) {
                left++;
            }
            while (array[right] >= 0) {
                right--;
            }

            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    }
}
