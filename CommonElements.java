//Write a Java program to find common elements between two arrays (string values).
import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "orange", "kiwi"};
        String[] array2 = {"banana", "orange", "grape", "kiwi"};
        List<String> commonElements = new ArrayList<>();

        for (String element : array1) {
            if (Arrays.asList(array2).contains(element) && !commonElements.contains(element)) {
                commonElements.add(element);
            }
        }

        System.out.println("Common elements between the two arrays: " + commonElements);
    }
}
