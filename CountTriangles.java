/*Write a Java program to count the number of possible triangles from a given unsorted array of positive integers.  
Note: The triangle inequality states that the sum of the lengths of any two sides of a triangle must be greater than or equal to the length of the third side.

*/
import java.util.Arrays;

public class CountTriangles {
    public static void main(String[] args) {
        int[] array = {4, 3, 5, 7, 6};
        System.out.println("Array: " + Arrays.toString(array));

        int count = countTriangles(array);
        System.out.println("Number of possible triangles: " + count);
    }

    public static int countTriangles(int[] array) {
        Arrays.sort(array);
        int count = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < array.length - 1; j++) {
                while (k < array.length && array[i] + array[j] > array[k]) {
                    k++;
                }
                count += k - j - 1;
            }
        }
        return count;
    }
}
