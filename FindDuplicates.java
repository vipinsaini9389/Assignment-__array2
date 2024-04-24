//Write a Java program to find duplicate values in an array of integer values.
import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 7, 7, 8};
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int value : array) {
            if (!set.add(value)) {
                duplicates.add(value);
            }
        }

        System.out.println("Duplicate values in the array: " + duplicates);
    }
}
