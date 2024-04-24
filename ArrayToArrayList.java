// Write a Java program to convert an array to an ArrayList.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("ArrayList: " + arrayList);
    }
}
