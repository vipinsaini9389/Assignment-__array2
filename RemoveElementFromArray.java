//Write a Java program to remove a specific element from an array.
import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int elementToRemove = 30;

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToRemove) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            int[] newArray = new int[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[j++] = array[i];
                }
            }
            array = newArray;
            System.out.println("Element " + elementToRemove + " removed from the array");
        } else {
            System.out.println("Element " + elementToRemove + " not found in the array");
        }

        System.out.println("Array after removal: " + Arrays.toString(array));
    }
}
