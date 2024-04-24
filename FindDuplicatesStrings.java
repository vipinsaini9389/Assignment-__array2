 //Write a Java program to find duplicate values in an array of string values.

import java.util.*;

public class FindDuplicatesStrings {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "apple", "kiwi", "banana"};
        List<String> duplicates = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j]) && !duplicates.contains(array[i])) {
                    duplicates.add(array[i]);
                    break; // No need to continue checking for this element
                }
            }
        }

        System.out.println("Duplicate values in the array: " + duplicates);
    }
}
